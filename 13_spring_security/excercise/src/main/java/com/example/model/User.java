package com.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String userPassword;

    private boolean isEnable;

    public User() {
    }

    public User(int id, String userName, String userPassword, boolean isEnable) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.isEnable = isEnable;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roleList;
}

package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nameCategory;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Blog> blogs;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.nameCategory = name;
    }

    public Set<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String name) {
        this.nameCategory = name;
    }
}

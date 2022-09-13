package com.example.dao;

import com.example.model.Login;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setName("John");
        user1.setEmail("John@codegym.vn");
        user1.setAccount("John");
        user1.setPassword("123456");
        user1.setAge(10);
        users.add(user1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccount("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccount("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User user : users) {
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return  user;
            }
        }
        return null;
    }
}

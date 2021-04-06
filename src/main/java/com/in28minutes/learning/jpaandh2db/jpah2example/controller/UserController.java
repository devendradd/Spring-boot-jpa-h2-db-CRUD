package com.in28minutes.learning.jpaandh2db.jpah2example.controller;

import com.in28minutes.learning.jpaandh2db.jpah2example.dao.User;
import com.in28minutes.learning.jpaandh2db.jpah2example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/getall")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }
}

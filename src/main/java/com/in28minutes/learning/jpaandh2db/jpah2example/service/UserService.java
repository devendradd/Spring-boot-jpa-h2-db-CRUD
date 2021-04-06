package com.in28minutes.learning.jpaandh2db.jpah2example.service;

import com.in28minutes.learning.jpaandh2db.jpah2example.dao.User;
import com.in28minutes.learning.jpaandh2db.jpah2example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

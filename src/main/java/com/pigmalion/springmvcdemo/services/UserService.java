package com.pigmalion.springmvcdemo.services;

import com.pigmalion.springmvcdemo.model.User;
import com.pigmalion.springmvcdemo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<User> getAll () {
        return userRepository.findAll();
    }

    public User getById (Long id) {
        return userRepository.getOne(id);
    }

    public void create (User user) {
        userRepository.save(user);
    }

}

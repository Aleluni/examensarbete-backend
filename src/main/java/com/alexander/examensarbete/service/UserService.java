package com.alexander.examensarbete.service;

import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers(){return userRepo.findAll();}

    public User addUser(User user){
        return userRepo.save(user);
    }
}

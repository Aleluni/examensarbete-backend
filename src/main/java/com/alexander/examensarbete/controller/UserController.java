package com.alexander.examensarbete.controller;

import com.alexander.examensarbete.model.Recipe;
import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @GetMapping("/api/getusers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/api/post")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    @PutMapping("/api/put")
    public ResponseEntity<User>addRecipe(@RequestBody User user){

        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @RequestMapping("/user")
    public Principal user(Principal user){
        return user;
    }

}

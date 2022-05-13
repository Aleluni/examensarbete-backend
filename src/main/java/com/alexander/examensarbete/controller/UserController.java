package com.alexander.examensarbete.controller;

import com.alexander.examensarbete.model.Recipe;
import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.ReplicateScaleFilter;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/post")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<User>addRecipe(@RequestBody User user){

        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}

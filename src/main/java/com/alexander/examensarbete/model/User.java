package com.alexander.examensarbete.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Data
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private ArrayList<Recipe> recipes;

}

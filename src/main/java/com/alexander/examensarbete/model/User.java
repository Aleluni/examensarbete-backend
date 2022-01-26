package com.alexander.examensarbete.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private String recipe;
    private String comment;
    private int rating;
    private boolean isAdmin;
}

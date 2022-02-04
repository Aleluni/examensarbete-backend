package com.alexander.examensarbete.model;

import lombok.Data;

@Data
public class Recipe {

    private String recipeLink;
    private String comment;
    private int rating;
    private boolean isAdmin;
}

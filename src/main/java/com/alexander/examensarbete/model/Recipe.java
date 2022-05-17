package com.alexander.examensarbete.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "recipe")
public class Recipe {
    @Id
    private String id;

    private String recipeLink;
    private String comment;
    private int rating;
    //private boolean isAdmin;
}

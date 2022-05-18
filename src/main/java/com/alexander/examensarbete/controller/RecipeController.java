package com.alexander.examensarbete.controller;

import com.alexander.examensarbete.model.Recipe;
import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.service.RecipeService;
import com.alexander.examensarbete.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/api/getrecipe")
    public ResponseEntity<List<Recipe>> getAllUsers(){
        List<Recipe> recipes = recipeService.findAllRecpies();

        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }

    @PostMapping("/api/recipepost")
    public ResponseEntity<Recipe> addUser(@RequestBody Recipe recipe){
       Recipe newRecipe = recipeService.addRecipe(recipe);
        return new ResponseEntity<>(newRecipe,HttpStatus.CREATED);
    }
}

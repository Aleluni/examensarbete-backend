package com.alexander.examensarbete.service;

import com.alexander.examensarbete.model.Recipe;
import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.repository.RecipeRepo;
import com.alexander.examensarbete.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepo recipeRepo;

    @Autowired
    public RecipeService(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    public List<Recipe> findAllRecpies(){return recipeRepo.findAll();}

    public Recipe addRecipe(Recipe recipe){
        return recipeRepo.save(recipe);
    }

}

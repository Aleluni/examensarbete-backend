package com.alexander.examensarbete.repository;

import com.alexander.examensarbete.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RecipeRepo extends MongoRepository<Recipe,String> {

}

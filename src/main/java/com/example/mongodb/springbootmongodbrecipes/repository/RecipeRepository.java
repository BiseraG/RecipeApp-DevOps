package com.example.mongodb.springbootmongodbrecipes.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.springbootmongodbrecipes.model.Recipe;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
    List<Recipe> findByNameContaining(String name);
}

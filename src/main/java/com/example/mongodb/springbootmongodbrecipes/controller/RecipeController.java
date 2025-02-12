package com.example.mongodb.springbootmongodbrecipes.controller;

import com.example.mongodb.springbootmongodbrecipes.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RecipeController {
    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "index";
    }
}
package com.netcracker.eaters.controller;

import com.netcracker.eaters.receipts.Recipe;
import com.netcracker.eaters.receipts.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipe")
public class recipeController {
    @Autowired
    @Qualifier("RecipeService")
    private RecipeService recipeService;

    public String showRecipe() {
       return null;
    }
}

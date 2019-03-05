package com.netcracker.eaters.receipts;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("RecipeService")
public interface RecipeService {
    public List<Recipe> getRecipes();
}

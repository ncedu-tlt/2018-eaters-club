package com.netcracker.eaters.receipts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("RecipeService")
public class RecipeServiceImpl implements RecipeService {

    @Override
    public List<Recipe> getRecipes() {
        List<Recipe> list = new ArrayList<>();
        list.add(new Recipe("Картошка по французски", "Картошка по-французски запекается в духовке с мясом и луком.", 4));
        return list;
    }
}

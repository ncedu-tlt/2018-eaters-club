package com.netcracker.eaters.receipts;

import com.netcracker.eaters.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private Rating rating;
    private HashSet<Ingredient> ingredients;
    private List<Tag> tags = new ArrayList<>();

    //Class default constructor
    public Recipe(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = new Rating(rating);
    }

    //add ingredient method ex.
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        System.out.println(ingredient.getName() + " has been added");
    }

    public void removeIngredient(Ingredient ingredient) {
        Iterator<Ingredient> it = ingredients.iterator();

        while (it.hasNext()) {
            if (it.next().equals(ingredient)) {
                System.out.println(ingredient.getName() + " has been removed");
                it.remove();
                break;
            } else {
                System.out.println("There is no specified ingredient!");
            }
        }
    }

    public void cleanIngredients() {
        ingredients.clear();
    }

    public void showIngredients() {
        Iterator<Ingredient> it = ingredients.iterator();

        if (ingredients.isEmpty()) {
            System.out.println("There is no ingredients!");
        } else {
            while (it.hasNext()) {
                System.out.print(it.next().getName() + " ");
            }
        }
        System.out.println("\n");
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void removeTag(Tag tag) {
        Iterator<Tag> it = tags.iterator();

        while (it.hasNext()) {
            if (it.next() == tag) {
                it.remove();
                System.out.println("The tag: " + tag.name + " has been removed");
                break;
            } else {
                System.out.println("There is no specified tag!");
            }
        }
    }

    public void showTags() {
        System.out.print("Tags: ");
        for (Tag x : tags) {
            System.out.print("#" + x.name + " ");
        }
        System.out.println("\n");
    }

    public void cleanTags() {
        tags.clear();
    }

    public void showRecipe() {
        System.out.println(name + "\n");
        System.out.println(description + "\n");
        System.out.print("Чтобы приготовить: " + name + " необходимо: ");
        showIngredients();
        showTags();
    }
}



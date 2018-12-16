package eaters.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private int rating;
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

    public Recipe(String name, String descriprion) {
        this.name = name;
        this.description = descriprion;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        System.out.println(ingredient.name + " has been added");
    }

    public void removeIngredient(Ingredient ingredient) {
        Iterator<Ingredient> it = ingredients.iterator();

//        for (Ingredient x : ingredients) {
//            if (x == ingredient) {
//                this.ingredients.remove(x);
//
//
//                System.out.println(x.name + " has been removed");
//            } else {
//                System.out.println("There is no specified ingerdient!");
//            }
//        }

        while (it.hasNext()){
            if (it.next().equals(ingredient)) {
                System.out.println(it.next().name + " has been removed");
                it.remove();
            } else {
                System.out.println("There is no specified ingredient!");
            }
        }
    }

    public void cleanIngredients() {
        ingredients.clear();
        System.out.println("All ingredients has been removed!");
    }

    public void showIngredients() {
        if (ingredients.isEmpty()) {
            System.out.println("There is no ingredients!");
        } else {
            for (Ingredient x : ingredients)
                System.out.print(x.name + " ");
        }
        System.out.println("\n");
    }

    public void setRating(int rating) {
        final int[] ratings = {1, 2, 3, 4, 5};
        if (rating > ratings.length - 1 || rating < 0) {
            System.out.println("The rating should be 1..5");
        } else {
            this.rating = rating;
        }
    }

    public void showRating() {
        System.out.print("Rating: ");
        if (rating == 0) {
            System.out.println("Unrated");
        } else {
            for (int x = 0; x < rating; x++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public void addTag(Tag tag) {
        tags.add(tag);
        System.out.println("The tag: " + tag.name + " has been added");
    }

    public void removeTag(Tag tag) {
        for (Tag x : tags)
            if (x == tag) {
                tags.remove(x);
                System.out.println("The tag: " + x.name + " has been removed");
            } else {
                System.out.println("There is no specified tag!");
            }
    }


    public void showTags() {
        System.out.print("Tags: ");
        if (tags.isEmpty()) {
            System.out.println("There is no tags");
        } else {
            for (Tag x : tags)
                System.out.print("#" + x.name + " ");
        }
    }

    public void cleanTags() {
        tags.clear();
        System.out.println("All tags has been removed!");
    }

    public void showRecipe() {
        System.out.println(name + "\n");
        System.out.println(description + "\n");
        System.out.print("Чтобы приготовить: " + name + " необходимо: ");
        showIngredients();
        showRating();
        showTags();
    }
}



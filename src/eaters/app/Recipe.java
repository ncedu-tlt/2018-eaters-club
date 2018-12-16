package eaters.app;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private Rating rating = new Rating();
    private HashSet<Ingredient> ingredients = new HashSet<>();
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

        while (it.hasNext()) {
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
    }

    public void showIngredients() {
        Iterator<Ingredient> it = ingredients.iterator();

        if (ingredients.isEmpty()) {
            System.out.println("There is no ingredients!");
        } else {
            while (it.hasNext()) {
                System.out.print(it.next().name + " ");
            }
        }
        System.out.println("\n");
    }

    public void setRating(int rating) {
        this.rating.setRating(rating);
    }

    public void showRating() {
        this.rating.showRating();
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
        showRating();
        showTags();
    }
}



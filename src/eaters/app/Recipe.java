package eaters.app;

import java.util.List;

public class Recipe {
    String name;
    String description;
    int rating = 0;
    List<Ingredient> ingredients;
    List<Tag> tags;

    public Recipe(String name, String descriprion) {
        this.name = name;
        this.description = descriprion;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        System.out.println(ingredient.name + " has been added");
    }

    public void removeIngredient(Ingredient ingredient) {
        for (Ingredient x : this.ingredients) {
            if (x == ingredient) {
                this.ingredients.remove(x);
                System.out.println(x.name + " has been removed");
            } else {
                System.out.println("There is no specified ingerdient!");
            }
        }
    }

    public void cleanIngredients() {
        this.ingredients.clear();
        System.out.println("All ingredients has been removed!");
    }

    public void showIngredients() {
        if (this.ingredients.isEmpty()) {
            System.out.println("There is no ingredients!");
        } else {
            for (Ingredient x : this.ingredients)
                System.out.println("#" + x.name + " ");
        }
        System.out.println("\n\n");
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
        if (this.rating == 0) {
            System.out.println("Unrated");
        } else {
            for (int x = 0; x < this.rating; x++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
        System.out.print("The tag: " + tag.name + " has been added");
    }

    public void removeTag(Tag tag) {
        for (Tag x : this.tags)
            if (x == tag) {
                this.tags.remove(x);
                System.out.println("The tag: " + x.name + " has been removed");
            } else {
                System.out.println("There is no specified tag!");
            }
    }


    public void showTags() {
        if (this.tags.isEmpty()) {
            System.out.println("There is no tags");
        } else {
            for (Tag x : this.tags)
                System.out.println("#" + x.name + " ");
        }
    }

    public void cleanTags() {
        this.tags.clear();
        System.out.println("All tags has been removed!");
    }

    public void showRecipe() {
        System.out.println(this.name + "\n");
        System.out.println(this.description + "\n");
        System.out.print("Чтобы приготовить:" + this.name + " необходимо ");
        showIngredients();
        showRating();
        showTags();
    }
}



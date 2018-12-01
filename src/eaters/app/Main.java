package eaters.app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Eaters Club!");

//        initialize ingredient
        Ingredient egg = new Ingredient("Яйцо");
        Ingredient onion = new Ingredient("Лук");

//        initialize Tags
        Tag tag1 = new Tag ("вкусняха!", "#");
        Tag tag2 = new Tag ("больше лука!", "#");

//        initialize Recipe
        Recipe recipe1 = new Recipe("Яичница", "Яичница — королева завтраков.");

//        add ingredients
        recipe1.addIngredient(onion);
        recipe1.addIngredient(egg);

//        set rating
        recipe1.setRating(4);

//        add tags
        recipe1.addTag(tag1);
        recipe1.addTag(tag2);

//        show the result
        recipe1.showRecipe();

//        tests
//        recipe1.setRating(2);
//        recipe1.removeIngredient(onion);
//        recipe1.cleanTags();
//        recipe1.showRecipe();
    }
}

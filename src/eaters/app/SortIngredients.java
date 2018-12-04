package eaters.app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIngredients {

    public void sortIngredientCalories(List<Ingredient> ingredients){

        Collections.sort(ingredients, IngredientCaloriesComparator);

        System.out.println("--------------------------- Сортировка по калорийности");

        for(Ingredient ing : ingredients){
            System.out.println(ing);
            System.out.println();
        }
    }

    public void sortIngredientShelfLifeDate(List<Ingredient> ingredients){
        Collections.sort(ingredients, IngredientShelfDateComparator);

        System.out.println("---------------------------- Сортировка по сроку годности");

        for(Ingredient ing : ingredients){
            System.out.println(ing);
            System.out.println();
        }
    }

    private Comparator<Ingredient> IngredientCaloriesComparator = new Comparator<Ingredient>() {
        @Override
        public int compare(Ingredient i2, Ingredient i3) {
            int calories2 = (int) i2.getCalories();
            int calories3 = (int) i3.getCalories();

            return calories3-calories2;
        }
    };

    private Comparator<Ingredient> IngredientShelfDateComparator = new Comparator<Ingredient>() {
        @Override
        public int compare(Ingredient i2, Ingredient i3) {
            return i2.getShelfLifeDate().compareTo(i3.getShelfLifeDate());
        }
    };
}

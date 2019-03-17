package com.netcracker.eaters.ingredients;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class DemoManager {
    private static List<Ingredient> ingredients = new ArrayList<Ingredient>();
    SortIngredients sortCalories = new SortIngredients();

    public void menu() throws ParseException {
        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        // Наполнение холодильника продуктами
        fillFridge();

        System.out.println("Добро пожаловать в холодильник!");

        while (isRunning) {
            System.out.println("Выберете действие:\n" +
                    "1. Обзор холодильника\n" +
                    "2. Обзор холодильника (короткий список)\n" +
                    "3. Сортировка ингредиентов по сроку годности\n" +
                    "4. Сортировка ингредиентов по калорийности\n" +
                    "5. Добавить ингредиент\n" +
                    "6. Использовать ингредиент\n" +
                    "7. Удалить ингредиент\n" +
                    "0. Выход");

            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    // Что в холодильнике?
                    observeFridge();
                    break;
                case "2":
                    // Короткий список ингредиентов
                    observeFridgeShortList();
                    break;
                case "3":
                    // Сортировка всех продуктов по сроку годности (от наименьшего к наибольшему)
                    sortIngredientShelfLifeDate();
                    break;
                case "4":
                    // Сортировка всех продуктов по калорийности (от большего к меньшему)
                    sortIngredientCalories();
                    break;
                case "5":
                    // Добавить ингредиент
                    add();
                    break;
                case "6":
                    // Использовать ингредиент
                    spend();
                    break;
                case "7":
                    // Удалить ингредиент
                    remove();
                    break;
                case "0":
                    isRunning = false;
                default:
                    break;
            } // switch(menu)
        } // while(isRunning)
    }

    public static void fillFridge() throws ParseException {
        // Create ingredients
        Ingredient milk = new Ingredient();
        Ingredient meat = new Ingredient();
        Ingredient bread = new Ingredient();
        Ingredient agg = new Ingredient();
        Ingredient butter = new Ingredient();

        milk.setName("Milk");
        meat.setName("Meat");
        bread.setName("Bread");
        agg.setName("Agg");
        butter.setName("Butter");

        milk.setGroup(Group.Milk);
        meat.setGroup(Group.Meat);
        bread.setGroup(Group.Bakery);
        agg.setGroup(Group.Eggs);
        butter.setGroup(Group.Fat);

        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        String shelfLifeData = "01.01.2019";

        Date date = ft.parse(shelfLifeData);
        milk.setShelfLifeDate(ft.parse("01.01.2019"));
        meat.setShelfLifeDate(ft.parse("19.12.2018"));
        bread.setShelfLifeDate(ft.parse("04.11.2018"));
        agg.setShelfLifeDate(ft.parse("20.19.2018"));
        butter.setShelfLifeDate(ft.parse("31.12.2018"));

        milk.setValue(1000);
        meat.setValue(200);
        bread.setValue(900);
        agg.setValue(30);
        butter.setValue(250);

        milk.setDimention(Dimention.ml);
        meat.setDimention(Dimention.g);
        bread.setDimention(Dimention.g);
        agg.setDimention(Dimention.pcs);
        butter.setDimention(Dimention.g);

        milk.setDescription("Milk, 3,2%, 1 liter");
        meat.setDescription("Beaf");
        bread.setDescription("Loaf of bread (black)");
        agg.setDescription("Aggs");
        butter.setDescription("Butter, 80%, 200g");

        milk.setTags("milk");
        meat.setTags("meat");
        bread.setTags("bread");
        agg.setTags("agg");
        butter.setTags("butter");

        milk.setPFC(3.2, 3.6, 4.8);
        meat.setPFC(20.4, 12.7, 0.5);
        bread.setPFC(6.8, 1.4, 45.6);
        agg.setPFC(12.7, 10.7, 0.8);
        butter.setPFC(0.5, 82.5, 0.8);

        ingredients.add(milk);
        ingredients.add(meat);
        ingredients.add(bread);
        ingredients.add(agg);
        ingredients.add(butter);

    }

    public static void observeFridge() {
        System.out.println("В Вашем холодильнике лежит:");
        for (Ingredient tmp : ingredients) {
            System.out.println(tmp);
            System.out.println();
        }
    }

    public static void observeFridgeShortList() {
        System.out.println("В Вашем холодильнике лежит:");
        for (Ingredient tmp : ingredients) {
            System.out.println(tmp.getName() + " (" + tmp.getValue() + tmp.getDimention() + ") " + tmp.getHashCodeID());
        }
    }

    public static void add() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        double carbohydrates;
        double fat;
        double protein;
        String formatDate = "dd.MM.yyyy";
        SimpleDateFormat ft = new SimpleDateFormat(formatDate);
        Ingredient newIngredient = new Ingredient();

        System.out.print(" Введите имя ингредиента (Name):");
        inputString = scanner.nextLine();
        if (inputString != null) {
            newIngredient.setName(inputString);
        }

        System.out.println(" Выберите группу ингредиента (Group):");
        for (Group tmp : Group.values()) {
            System.out.println(tmp);
        }
        inputString = scanner.nextLine();

        if (inputString != null) {
            switch (inputString) {
                case "Meat":
                    newIngredient.setGroup(Group.Meat);
                    break;
                case "Fruits":
                    newIngredient.setGroup(Group.Fruits);
                    break;
                case "Vegetables":
                    newIngredient.setGroup(Group.Vegetables);
                    break;
                case "Seafood":
                    newIngredient.setGroup(Group.Seafood);
                    break;
                case "Chicken":
                    newIngredient.setGroup(Group.Chicken);
                    break;
                case "Eggs":
                    newIngredient.setGroup(Group.Eggs);
                    break;
                case "Milk":
                    newIngredient.setGroup(Group.Milk);
                    break;
                case "Beans":
                    newIngredient.setGroup(Group.Beans);
                    break;
                case "Bakery":
                    newIngredient.setGroup(Group.Bakery);
                    break;
                case "Fat":
                    newIngredient.setGroup(Group.Fat);
            }
        }

        System.out.print(" Введите срок годности ингредиента (helfLifeDate) в формате " + formatDate + " :");
        inputString = scanner.nextLine();
        if (inputString != null) {
            newIngredient.setShelfLifeDate(ft.parse(valueOf(inputString)));
        }

        System.out.print(" Введите объем/массу ингредиента (Value):");
        inputString = scanner.nextLine();
        if (inputString != null) {
            newIngredient.setValue(parseInt(inputString));
        }

        System.out.println(" Введите размерность ингредиента (Dimention):");
        for (Dimention tmp : Dimention.values()) {
            System.out.println(tmp);
        }
        if (inputString != null) {
            inputString = scanner.nextLine();
        }

        switch (inputString) {
            case "g":
                newIngredient.setDimention(Dimention.g);
                break;
            case "ml":
                newIngredient.setDimention(Dimention.g);
                break;
            case "pcs":
                newIngredient.setDimention(Dimention.g);
                break;
            default:
                break;
        }

        System.out.print(" Впишите описание ингредиента (Description):");
        inputString = scanner.nextLine();
        if (inputString != null) {
            newIngredient.setDescription(inputString);
        }

        System.out.print(" Добавьте тэг ингредиенту:");
        inputString = scanner.nextLine();
        if (inputString != null) {
            newIngredient.setTags(inputString);
        }

        System.out.print(" Введите содержание белков в ингредиенте (g):");
        protein = parseDouble(scanner.nextLine());
        System.out.print(" Введите содержание жиров в ингредиенте (g):");
        fat = parseDouble(scanner.nextLine());
        System.out.print(" Введите содержание углеводов в ингредиенте (g):");
        carbohydrates = parseDouble(scanner.nextLine());
        newIngredient.setPFC(protein, fat, carbohydrates);

        ingredients.add(newIngredient);
    }

    public static void spend() {
        Scanner scanner = new Scanner(System.in);
        Ingredient ingredientToSpend = null;

        System.out.print("\nВведите hashCodeID ингредиента:");
        int hashCodeID = parseInt(scanner.nextLine());
        System.out.print("\nВыставить объем/массу ингредиента:");
        int value = parseInt(scanner.nextLine());

        for (Ingredient tmp : ingredients) {
            if (hashCodeID == tmp.getHashCodeID()) {
                ingredientToSpend = tmp;
            }
            ;
        }

        ingredients.remove(ingredientToSpend);

        ingredientToSpend.setValue(value);
        ingredients.add(ingredientToSpend);

        System.out.println("Изменение ингредиента:\n" + ingredientToSpend);
    }

    public static void remove() {
        Ingredient ingredientToRemove = null;
        Scanner scanner = new Scanner(System.in);
        int hashCodeID = parseInt(scanner.nextLine());
        for (Ingredient tmp : ingredients) {
            if (hashCodeID == tmp.getHashCodeID()) {
                ingredientToRemove = tmp;
            }
            ;
        }
        ingredients.remove(ingredientToRemove);
        System.out.println("Ингредиент удален из холодильника.");
    }

    public void sortIngredientShelfLifeDate() {
        sortCalories.sortIngredientShelfLifeDate(ingredients);
    }

    ;

    public void sortIngredientCalories() {
        sortCalories.sortIngredientCalories(ingredients);
    }

    ;
}

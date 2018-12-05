package eaters.app;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);
        DemoManager demo = new DemoManager();

        // Наполнение холодильника продуктами
        demo.fillFridge();

        System.out.println("Добро пожаловать в холодильник!");

        while(isRunning) {
            System.out.println("Выберете действие:\n" +
                    "1. Обзор холодильника\n" +
                    "2. Обзор холодильника (короткий список)\n" +
                    "3. Сортировка ингредиентов по сроку годности\n" +
                    "4. Сортировка ингредиентов по калорийности\n" +
                    "5. Добавить ингредиент\n" +
                    "6. Использовать ингредиент\n" +
                    "7. Удалить ингредиент");

            String menu = scanner.nextLine();

            switch(menu) {
                case "1":
                    // Что в холодильнике?
                    demo.observeFridge();
                    break;
                case "2":
                    // Короткий список ингредиентов
                    demo.observeFridgeShortList();
                    break;
                case "3":
                    // Сортировка всех продуктов по сроку годности (от наименьшего к наибольшему)
                    demo.sortIngredientShelfLifeDate();
                    break;
                case "4":
                    // Сортировка всех продуктов по калорийности (от большего к меньшему)
                    demo.sortIngredientCalories();
                    break;
                case "5":
                    // Добавить ингредиент
                    demo.add();
                    break;
                case "6":
                    // Использовать ингредиент
                    demo.spend();
                    break;
                case "7":
                    // Удалить ингредиент
                    demo.remove();
                    break;
                case "0":
                    isRunning = false;
                default:
                    break;
            } // switch(menu)
        } // while(isRunning)
    } // public static void main(String[] args)
}

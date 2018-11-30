package eaters.app;

import javax.swing.text.html.HTML;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello, Eaters Club!");

        // Create ingredient
        Ingredient milk = new Ingredient();

        milk.setName("Milk");

        milk.setGroup(Group.Milk);

        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        String shelfLifeData = "01.01.2019";
        Date date = ft.parse(shelfLifeData);
        milk.setShelfLifeData(date);

        milk.setValue(1000);

        milk.setDimention(Dimention.ml);

        milk.setDescription("Milk, 3,2%, 1 liter");

        milk.setTags("#milk");
        milk.setTags("#moloko");
        milk.setTags("#molokomoloko");


        System.out.println(milk.getTags());

        milk.deleteTag("#milk");

        System.out.println(milk.getTags());

        milk.deleteAllTags();

        System.out.println(milk.getTags());



    }
}

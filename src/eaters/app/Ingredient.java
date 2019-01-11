package eaters.app;

import java.util.Date;
import java.util.Collection;
import java.util.HashSet;

public class Ingredient {
    private String getName;                                    // Name of ingredient
    private Group group;                                    // Name of ingredient
    private Date manufactureDate;                           // Date of manufacturing
    private Date shelfLifeDate;                             // Shelf life date
    private int value;                                      // Volume of product (in g/ml/pcs; see dimention)
    private Dimention dimention;                            // Unit of measurement
    private String description;                             // Description of ingredient
    private Collection<String> tags = new HashSet<>();      // Tags of ingredient
    private double proteins;                                // 100g = 400kCal
    private double fats;                                    // 100g = 900kCal
    private double carbohydrates;                           // 100g = 400kCal
    private double calories;                                // Energy value (kCal/100g)
    private int hashCodeID;                                // Unique identifier

    @Override
    public String toString() {
        String toString = "Ингредиент: " + getName() +
                "\nОписание: " + getDescription() +
                "\nСрок годности: " + getShelfLifeDate() +
                "\nОсталось в холодильнике: " + getValue() + getDimention() +
                "\nКалорийность (на 100г): " + getCalories();
        return toString;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Ingredient() {
        this.manufactureDate = new Date();
        this.hashCodeID = hashCode();
    }

    public void setPFC(double proteins, double fats, double carbohydrates) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }



    public void deleteTag(String tag) {
        tags.remove(tag);
    }

    public void deleteAllTags() {
        tags.clear();
    }

    public void setName(String name) { this.getName = name; }

    public void setGroup(Group group) { this.group = group; }

    public void setShelfLifeDate(Date shelfLifeDate) { this.shelfLifeDate = shelfLifeDate; }

    public void setValue(int value) { this.value = value; }

    public void setDimention(Dimention dimention) { this.dimention = dimention; }

    public void setDescription(String description) { this.description = description; }

    public void setTags(String tag) { tags.add(tag); }



    public double getCalories() {
        calories = (4 * proteins) + (9 * fats) + (4 * carbohydrates); // total energy per 100g of ingredient
        return calories;
    }

    public double getProteins() { return proteins; }

    public double getFats() { return fats; }

    public double getCarbohydrates() { return carbohydrates; }

    public String getName() { return getName; }

    public Group getGroup() { return group; }

    public Date getShelfLifeDate() {
        Date copyShelfLifeDate = shelfLifeDate;
        return copyShelfLifeDate;
    }

    public int getValue() { return value; }

    public Dimention getDimention() { return dimention; }

    public String getDescription() { return description; }

    public Collection<String> getTags() { return tags; }

    public int getHashCodeID() { return hashCode(); }

}

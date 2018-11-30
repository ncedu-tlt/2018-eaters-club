package eaters.app;

import java.util.Date;
import java.util.Collection;
import java.util.HashSet;

//import static javax.swing.text.html.HTML.*;

public class Ingredient {
    private String name;
    private Group group;
    private Date manufactureData;
    private Date shelfLifeData;
    private int value;
    private Dimention dimention;
    private String description;
    private Collection<String> tags = new HashSet<>();

    public Ingredient() {
        this.manufactureData = new Date();
    }

    public void deleteTag(String tag) {
        tags.remove(tag);
    }

    public void deleteAllTags() {
        tags.clear();
    }

    public void setName(String name) { this.name = name; }

    public void setGroup(Group group) { this.group = group; }

    public void setShelfLifeData(Date shelfLifeData) { this.shelfLifeData = shelfLifeData; }

    public void setValue(int value) { this.value = value; }

    public void setDimention(Dimention dimention) { this.dimention = dimention; }

    public void setDescription(String description) { this.description = description; }

    public void setTags(String tag) { tags.add(tag); }


    public String getName() { return name; }

    public Group getGroup() { return group; }

    public Date getShelfLifeData() { return shelfLifeData; }

    public int getValue() { return value; }

    public Dimention getDimention() { return dimention; }

    public String getDescription() { return description; }

    public Collection<String> getTags() { return tags; }
}

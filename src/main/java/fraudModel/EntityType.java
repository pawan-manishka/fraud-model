package fraudModel;

import java.util.ArrayList;

/**
 * Created by pawan on 6/5/17.
 */
public class EntityType {

    private String name;
    private ArrayList<Field> fields;

    public EntityType(String name, ArrayList<Field> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }
}

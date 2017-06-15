package fraudModel;

import java.util.Map;

/**
 * Created by pawan on 6/5/17.
 */
public class Entity {

    private Map<String, Object> fields;
    private EntityType type;

    public Entity(Map<String, Object> fields, EntityType type) {

        this.fields = fields;
        this.type = type;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public EntityType getType() {
        return type;
    }
}

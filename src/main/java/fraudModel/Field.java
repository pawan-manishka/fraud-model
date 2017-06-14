package fraudModel;

/**
 * Created by pawan on 6/5/17.
 */
public class Field {

    private String type;
    private String name;
    private String foreignEntityTypeName;
    private String foreignEntityKeyName;
    private String relationship;
    private boolean isPrimaryKey;

    public Field(String type, String name, String foreignEntityTypeName, String foreignEntityName, String relationship, boolean isPrimaryKey) {
        this.type = type;
        this.name = name;
        this.foreignEntityTypeName = foreignEntityTypeName;
        this.foreignEntityKeyName = foreignEntityName;
        this.relationship = relationship;
        this.isPrimaryKey = isPrimaryKey;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getForeignEntityTypeName() {
        return foreignEntityTypeName;
    }

    public String getForeignEntityKeyName() {
        return foreignEntityKeyName;
    }

    public String getRelationship() {
        return relationship;
    }

    public boolean getPrimaryKey() {
        return isPrimaryKey;
    }


}

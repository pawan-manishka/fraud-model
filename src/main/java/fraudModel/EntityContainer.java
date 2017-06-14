package fraudModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pawan on 6/11/17.
 */
public class EntityContainer {

    private Map<String,Entity> entityList;
    private List<EntityType> entityTypeList;

    public List<EntityType> getEntityTypeList() {
        return entityTypeList;
    }

    public EntityContainer() {
        this.entityList =  new HashMap<String, Entity>();
        this.entityTypeList = new ArrayList<EntityType>();
    }

    public Map<String, Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(Map<String, Entity> entityList) {
        this.entityList = entityList;
    }

    public void addEntityType(EntityType entityType){
        entityTypeList.add(entityType);
    }

    public void addEntity(String primaryKey, Entity entity){
        entityList.put(primaryKey,entity);
    }

    public void removeEntity(){}

    public void updateEntity(){}
}

package graph;

import fraudModel.Entity;
/**
 * Created by pawan on 6/7/17.
 */
public class Node {

    private String id;   // nodeId
    private String label;
    private int x = 1;
    private int y = 1;
    private int size = 1;
    private Entity entity;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public Node(String id, Entity entity) {
        this.id = id;
        this.label = id;
        this.entity = entity;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public Entity getEntity() {
        return entity;
    }

}

package graph;

import fraudModel.Entity;
/**
 * Created by pawan on 6/7/17.
 */
public class Node {

    private String nodeId;
    private Entity entity;
    private String label;

    public Node(String nodeId, Entity entity) {
        this.nodeId = nodeId;
        this.entity = entity;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getLabel() {
        return label;
    }

    public Entity getEntity() {
        return entity;
    }


    public void addNode() {
    }
}

//private int x;
//private int y;
//private int size;
package graph;

import fraudModel.Field;

/**
 * Created by pawan on 6/7/17.
 */
public class Edge {

    private String edgeId;
    private String sourceNode;
    private String targetNode;
    private String relationshipLabel;

    public Edge(String source, String target) {
        this.sourceNode=source;
        this.targetNode=target;
    }

    public Edge(Field field) {
    }

    public Edge(Field field, String name, String foreignEntityTypeName) {
    }

    public String getEdgeId() {
        return edgeId;
    }

    public String getSourceNode() {
        return sourceNode;
    }

    public String getTargetNode() {
        return targetNode;
    }

    public String getRelationshipLabel() {
        return relationshipLabel;
    }

}

package graph;

import fraudModel.Field;

/**
 * Created by pawan on 6/7/17.
 */
public class Edge {

    private String id;
    private String source;  // sourceNode
    private String target;  // targetNode
    // private String relationshipLabel;

    public Edge(String edgeId, String source, String target) {
        this.id = edgeId;
        this.source = source;
        this.target = target;
    }

    public Edge(Field field, String name, String foreignEntityTypeName) {
    }

    public String getEdgeId() {
        return id;
    }

    public String getSourceNode() {
        return source;
    }

    public String getTargetNode() {
        return target;
    }
}

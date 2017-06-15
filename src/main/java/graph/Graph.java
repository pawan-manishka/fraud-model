package graph;

import fraudModel.Entity;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pawan on 6/9/17.
 */
public class Graph {

    private Map<String, Node> nodes;
    private Map<String, Edge> edges;
    private Map<String, Entity> entityList;

    public Map<String, Node> getNodes() {
        return nodes;
    }

    public Map<String, Edge> getEdges() {
        return edges;
    }

    public Map<String, Entity> getEntityList() {
        return entityList;
    }

    public Graph(Map<String, Entity> entityList) {
        this.nodes = new HashMap<String, Node>();
        this.edges = new HashMap<String, Edge>();
        this.entityList = entityList;
    }

    /* This is to create the nodes of the graph
     */
    public Map<String, Node> createNodes() {
        for (Map.Entry<String, Entity> entry : entityList.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            nodes.put(entry.getKey(), node);
        }
        System.out.println("CreatedNodes :" + nodes);
        return nodes;
    }

    /****
     * This is to create the edges of the graph
     * It will check the each field of the specific entity and get the foreign keys and create edges using those FKs.
     * loop through the each entity fields and find if there are FKs available
     ****/
    public void createEdges() {

        for (Map.Entry<String, Node> entry : nodes.entrySet()) {
            for (int i = 0; i < entry.getValue().getEntity().getFields().size(); i++) {    // loop through the each entry eg: person1 , 3
                if ((entry.getValue().getEntity().getType().getFields().get(i).getRelationship()) != null) {   // first check whether that field is a FK
                    String sourceNode = entry.getKey();
                    String fk = entry.getValue().getEntity().getType().getFields().get(i).getName();   // get the fk value
                    Map<String, Object> obj = entry.getValue().getEntity().getFields();

                    for (Map.Entry<String, Object> entry1 : obj.entrySet()) {
                        if (fk == entry1.getKey()) { // check there is a PK that match with fk
                            System.out.println("Foreign key : " + entry1.getKey() + " Value : " + entry1.getValue());
                            Edge edge = new Edge(sourceNode, entry1.getValue().toString());
                            String edgeId = sourceNode + entry1.getValue();
                            System.out.println("EdgeID : " + edgeId);
                            edges.put(edgeId, edge);
                        }
                    }

                } else {
                    //System.out.println("This is not a FK : ");
                }
            }
        }
        System.out.println(edges.size());
        System.out.println("Created Edges : " + edges);
    }

    public void addEdge() {
    }

    public void removeNode() {
    }

    public void removeEdge() {
    }

}




/*    public void createEdges() {

        for (Map.Entry<String, Node> entry : nodes.entrySet()) {

            for (int i = 0; i < entry.getValue().getEntity().getType().getFields().size(); i++) {

                if ((entry.getValue().getEntity().getType().getFields().get(i).getRelationship()) != null) {
                    System.out.print("This is a FK : ");
                    String sourceNode = entry.getKey();//entry.getValue().getType().getName();
                    //System.out.println(entry.getValue().getEntity().getFields().get(i));
                    String targetNodeType = entry.getValue().getEntity().getType().getFields().get(i).getForeignEntityTypeName();

                    System.out.println(sourceNode + targetNodeType);
                    String edgeId = sourceNode + targetNodeType;
                    Edge edge = new Edge(sourceNode, targetNodeType);
                    edges.put(edgeId, edge);

                } else {
                    System.out.println("not a FK ");
                }
                   *//* if (entry.getValue().getEntity().getType().getName().equals(targetNodeType)) {
                        System.out.println("" + entry.getValue().getEntity().getFields().entrySet().iterator().next());

                    }*//*
            }
        }
        System.out.println(edges.size());
        System.out.print("Created Edges : "+edges);
    }*/

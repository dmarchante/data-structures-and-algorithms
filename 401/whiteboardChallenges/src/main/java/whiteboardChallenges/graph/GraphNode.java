package whiteboardChallenges.graph;

import java.util.*;

public class GraphNode {
    private String label;
    private HashMap<GraphNode, Integer> neighbors;

    public void addNeighbor(GraphNode graphNode, Integer weight) {
        this.neighbors.put(graphNode, weight);
    }

    public String getLabel() {
        return label;
    }

    private void setLabel(String label) {
        this.label = label;
    }

    public HashMap<GraphNode, Integer> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashMap<GraphNode, Integer> neighbors) {
        this.neighbors = neighbors;
    }

    GraphNode(String label) {
        this.setLabel(label);
        this.neighbors = new HashMap<>();
    }
}

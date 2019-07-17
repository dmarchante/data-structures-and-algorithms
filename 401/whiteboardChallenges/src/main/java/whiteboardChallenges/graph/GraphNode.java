package whiteboardChallenges.graph;

import java.util.*;

public class GraphNode {
    private String label;
    private Map<GraphNode, Integer> neighbors;

    public void addNeighbor(GraphNode graphNode, Integer weight) {
        this.neighbors.put(graphNode, weight);
    }

    public String getLabel() {
        return label;
    }

    private void setLabel(String label) {
        this.label = label;
    }

    public Map<GraphNode, Integer> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Map<GraphNode, Integer> neighbors) {
        this.neighbors = neighbors;
    }

    GraphNode(String label) {
        this.setLabel(label);
        this.neighbors = new HashMap<>();
    }
}

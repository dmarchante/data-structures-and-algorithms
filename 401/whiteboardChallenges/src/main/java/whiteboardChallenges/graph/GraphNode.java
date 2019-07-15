package whiteboardChallenges.graph;

import java.util.*;

public class GraphNode {
    private String label;
    private Set<GraphNode> neighbors;

    public void addNeighbor(GraphNode graphNode) {
        this.neighbors.add(graphNode);
    }

    public String getLabel() {
        return label;
    }

    private void setLabel(String label) {
        this.label = label;
    }

    public Set<GraphNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Set<GraphNode> neighbors) {
        this.neighbors = neighbors;
    }

    GraphNode(String label) {
        this.setLabel(label);
        this.neighbors = new HashSet<>();
    }
}

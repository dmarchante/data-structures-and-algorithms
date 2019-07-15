package whiteboardChallenges.graph;

import java.util.ArrayList;
import java.util.Set;

public class Graph {
    private ArrayList<GraphNode> graphNodes;

    public void addGraphNode(String label) {
        GraphNode newGraphNode = new GraphNode(label);
        ArrayList<GraphNode> graphNodes = this.getGraphNodes();
        graphNodes.add(newGraphNode);
        this.setGraphNodes(graphNodes);
    }

    public void addEdge(GraphNode graphNodeOne, GraphNode graphNodeTwo) {
        graphNodeOne.addNeighbor(graphNodeTwo);
        graphNodeTwo.addNeighbor(graphNodeOne);
    }

    public Set<GraphNode> getNeighbors(GraphNode graphNode) {
        return graphNode.getNeighbors();
    }

    public int size() {
        return getGraphNodes().size();
    }

    public ArrayList<GraphNode> getGraphNodes() {
        return new ArrayList<>(this.graphNodes);
    }

    public void setGraphNodes(ArrayList<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
    }

    Graph () {
        this.setGraphNodes(new ArrayList<>());
    }
}

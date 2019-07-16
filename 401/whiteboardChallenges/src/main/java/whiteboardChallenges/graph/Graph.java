package whiteboardChallenges.graph;

import java.util.*;

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

    public List breadthFirst(GraphNode graphNode) {
        List orderList = new ArrayList();
        Set visited = new HashSet();
        Queue queue = new PriorityQueue();

        queue.add(graphNode);

        while(!queue.isEmpty()) {
            GraphNode nodeDeque = (GraphNode) queue.remove();
            visited.add(nodeDeque);
            orderList.add(nodeDeque);

            Iterator neighbors = nodeDeque.getNeighbors().iterator();

//            for(int i = 0; i < neighbors.size(); i ++){
//                if(visited.contains(neighbors[i])){
//                    queue.add(neighbors[i]);
//                }
//            }

            while(neighbors.hasNext()) {
                if(visited.contains(neighbors.next())){
                    queue.add(neighbors.next());
                }
            }
        }

        return orderList;
    }

    Graph () {
        this.setGraphNodes(new ArrayList<>());
    }
}

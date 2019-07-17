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

    public void addEdge(GraphNode graphNodeOne, GraphNode graphNodeTwo, Integer weight) {
        graphNodeOne.addNeighbor(graphNodeTwo, weight);
        graphNodeTwo.addNeighbor(graphNodeOne, weight);
    }

    public Map<GraphNode, Integer> getNeighbors(GraphNode graphNode) {
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

//    public List breadthFirst(GraphNode graphNode) {
//        List orderList = new ArrayList();
//        Set visited = new HashSet();
//        Queue queue = new PriorityQueue();
//
//        queue.add(graphNode);
//
//        while(!queue.isEmpty()) {
//            GraphNode nodeDeque = (GraphNode) queue.remove();
//            visited.add(nodeDeque);
//            orderList.add(nodeDeque);

//            Iterator neighbors = nodeDeque.getNeighbors();

//            for(int i = 0; i < neighbors.size(); i ++){
//                if(visited.contains(neighbors[i])){
//                    queue.add(neighbors[i]);
//                }
//            }

//            while(neighbors.hasNext()) {
//                if(visited.contains(neighbors.next())){
//                    queue.add(neighbors.next());
//                }
//            }
//        }
//
//        return orderList;
//    }

    public String directFlights (ArrayList<String> destinations) {
        ArrayList<GraphNode> graph = this.getGraphNodes();
        HashSet<String> graphValues = new HashSet<>();
        Integer cost = 0;

        for (int i = 0; i < graph.size(); i ++) {
            graphValues.add(graph.get(i).getLabel());
        }

        for(int i = 0; i < destinations.size() - 1; i ++) {
            boolean canTravel = false;

            Map<GraphNode, Integer> neighbors = new HashMap<>();

            if(graphValues.contains(destinations.get(i))) {
                neighbors = graph.get(i).getNeighbors();
            }

            for (GraphNode j : neighbors.keySet()) {
                if(j.getLabel().equals(destinations.get(i + 1))) {
                    canTravel = true;
                    cost += neighbors.get(j);
                }
            }

            if (!canTravel) {
                return "false, 0";
            }
        }

        return "true" + cost;
    }

    Graph () {
        this.setGraphNodes(new ArrayList<>());
    }
}

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

    public HashMap<GraphNode, Integer> getNeighbors(GraphNode graphNode) {
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

    public ArrayList<String> breadthFirst(GraphNode graphNode) {
        ArrayList<String> orderList = new ArrayList<>();
        HashSet<GraphNode> visited = new HashSet<>();
        Queue<GraphNode> queue = new LinkedList<>();

        queue.add(graphNode);

        while(!queue.isEmpty()) {
            GraphNode nodeDeque = queue.remove();
            visited.add(nodeDeque);

            HashMap<GraphNode, Integer> neighbors = nodeDeque.getNeighbors();

            for(GraphNode neighbor : neighbors.keySet()) {
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }

        for (GraphNode node : visited) {
            orderList.add(node.getLabel());
        }

        return orderList;
    }

    public ArrayList<String> depthFirst(GraphNode graphNode) {
        ArrayList<String> orderList = new ArrayList<>();
        HashSet<GraphNode> visited = new HashSet<>();
        Stack<GraphNode> stack = new Stack<>();

        stack.add(graphNode);

        while(!stack.isEmpty()) {
            GraphNode nodeDeque = stack.pop();
            visited.add(nodeDeque);

            HashMap<GraphNode, Integer> neighbors = nodeDeque.getNeighbors();

            for(GraphNode neighbor : neighbors.keySet()) {
                if(!visited.contains(neighbor)) {
                    stack.add(neighbor);
                }
            }
        }

        for (GraphNode node : visited) {
            orderList.add(node.getLabel());
        }

        return orderList;
    }

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
                return "False, $" + cost;
            }
        }

        return "True, $" + cost;
    }

    Graph () {
        this.setGraphNodes(new ArrayList<>());
    }
}

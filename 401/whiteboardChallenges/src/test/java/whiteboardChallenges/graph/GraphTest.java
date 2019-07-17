package whiteboardChallenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {
    private Graph graph;

    @Before
    public void setUp () {
        this.graph = new Graph();
        graph.addGraphNode("David");
        graph.addGraphNode("Stephen");
        graph.addGraphNode("Cristian");
        graph.addGraphNode("Will");
        graph.addGraphNode("Chai");

        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(1), 5);
        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(3), 6);
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(2), 7);
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(2), 8);
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(4), 9);
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(4), 4);
    }

    @Test
    public void testGraph() {
        assertEquals(5, graph.size());
    }

    @Test
    public void testGraph_Neighbors() {
        Map<GraphNode, Integer> amount = graph.getNeighbors(graph.getGraphNodes().get(0));

        assertEquals(2, amount.size());
    }

//    @Test
//    public void testGraph_breadthFirst() {
//        List amount = graph.breadthFirst(graph.getGraphNodes().get(0));
//
//        System.out.println(amount.size());
//    }


}
package whiteboardChallenges.graph;

import org.junit.Before;
import org.junit.Test;

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

        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(1));
        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(3));
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(2));
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(2));
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(4));
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(4));
    }

    @Test
    public void testGraph() {
        assertEquals(5, graph.size());
    }

    @Test
    public void testGraph_Neighbors() {
        Set<GraphNode> amount = graph.getNeighbors(graph.getGraphNodes().get(0));

        assertEquals(2, amount.size());
    }
}
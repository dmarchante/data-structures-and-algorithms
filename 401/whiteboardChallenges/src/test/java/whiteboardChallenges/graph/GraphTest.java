package whiteboardChallenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GraphTest {
    private Graph graph;

    @Before
    public void setUp () {
        this.graph = new Graph();
        graph.addGraphNode("Arendelle");
        graph.addGraphNode("Monstropolis");
        graph.addGraphNode("Naboo");
        graph.addGraphNode("Metroville");
        graph.addGraphNode("Pandora");
        graph.addGraphNode("Narnia");

        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(1), 42);
        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(3), 99);
        graph.addEdge(graph.getGraphNodes().get(0), graph.getGraphNodes().get(4), 150);
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(3), 105);
        graph.addEdge(graph.getGraphNodes().get(1), graph.getGraphNodes().get(2), 73);
        graph.addEdge(graph.getGraphNodes().get(2), graph.getGraphNodes().get(3), 26);
        graph.addEdge(graph.getGraphNodes().get(2), graph.getGraphNodes().get(5), 250);
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(5), 82);
        graph.addEdge(graph.getGraphNodes().get(3), graph.getGraphNodes().get(5), 37);
    }

    @Test
    public void testGraph() {
        assertEquals(6, graph.size());
    }

    @Test
    public void testGraph_Neighbors() {
        Map<GraphNode, Integer> amount = graph.getNeighbors(graph.getGraphNodes().get(0));

        assertEquals(3, amount.size());
    }

    @Test
    public void testGraph_breadthFirst() {
        ArrayList<String> nodeActual = graph.breadthFirst(graph.getGraphNodes().get(0));
        ArrayList<String> nodeExpected = new ArrayList<>();
        nodeExpected.add("Pandora");
        nodeExpected.add("Arendelle");
        nodeExpected.add("Naboo");
        nodeExpected.add("Metroville");
        nodeExpected.add("Monstropolis");
        nodeExpected.add("Narnia");

        assertEquals(nodeExpected, nodeActual);
    }

    @Test
    public void testGraph_flights() {
        String expected = "True, $42";
        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("Naboo");
        destinations.add("Monstropolis");

        String actual = graph.directFlights(destinations);

        assertEquals(expected, actual);
    }

    @Test
    public void testGraph_depth() {
        ArrayList<String> nodeActual = graph.depthFirst(graph.getGraphNodes().get(0));
        ArrayList<String> nodeExpected = new ArrayList<>();
        nodeExpected.add("Naboo");
        nodeExpected.add("Metroville");
        nodeExpected.add("Monstropolis");
        nodeExpected.add("Narnia");
        nodeExpected.add("Pandora");
        nodeExpected.add("Arendelle");

        assertEquals(nodeExpected, nodeActual);
    }
}
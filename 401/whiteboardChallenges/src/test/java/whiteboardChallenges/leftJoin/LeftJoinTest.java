package whiteboardChallenges.leftJoin;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.junit.Assert.*;

public class LeftJoinTest {
    HashMap<String, String> mapOne = new HashMap<>();
    HashMap<String, String> mapTwo = new HashMap<>();
    HashMap<String, String> mapEmpty = new HashMap<>();

    @Before
    public void setUp () {
        mapOne.put("fond", "enamored");
        mapOne.put("wrath", "anger");
        mapOne.put("diligent", "employed");
        mapOne.put("outfit", "garb");
        mapOne.put("guide", "usher");

        mapTwo.put("fond", "averse");
        mapTwo.put("wrath", "delight");
        mapTwo.put("diligent", "idle");
        mapTwo.put("guide", "follow");
        mapTwo.put("flow", "jam");
    }

    @Test
    public void leftJoinTest() {
        HashMap<String, List<String>> mapTest = new HashMap<>();
        mapTest.put("fond", new ArrayList<>(Arrays.asList("enamored", "averse")));
        mapTest.put("wrath", new ArrayList<>(Arrays.asList("anger", "delight")));
        mapTest.put("diligent", new ArrayList<>(Arrays.asList("employed", "idle")));
        mapTest.put("outfit", new ArrayList<>(Arrays.asList("garb")));
        mapTest.put("guide", new ArrayList<>(Arrays.asList("usher", "follow")));
        mapTest.put("flow", new ArrayList<>(Arrays.asList("jam")));

        HashMap<String, List<String>> mapActual = new LeftJoin().leftJoinMaps(mapOne, mapTwo);

        assertEquals(mapTest, mapActual);
    }

    @Test
    public void leftJoinTest_empty() {
        HashMap<String, List<String>> mapTest = new HashMap<>();
        mapTest.put("fond", new ArrayList<>(Arrays.asList("enamored")));
        mapTest.put("wrath", new ArrayList<>(Arrays.asList("anger")));
        mapTest.put("diligent", new ArrayList<>(Arrays.asList("employed")));
        mapTest.put("outfit", new ArrayList<>(Arrays.asList("garb")));
        mapTest.put("guide", new ArrayList<>(Arrays.asList("usher")));

        HashMap<String, List<String>> mapActual = new LeftJoin().leftJoinMaps(mapOne, mapEmpty);

        assertEquals(mapTest, mapActual);
    }
}
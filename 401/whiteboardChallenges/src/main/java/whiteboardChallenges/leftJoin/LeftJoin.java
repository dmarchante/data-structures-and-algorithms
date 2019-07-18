package whiteboardChallenges.leftJoin;

import java.util.*;

public class LeftJoin {
    public LeftJoin(){}

    public HashMap<String, List<String>> leftJoinMaps(HashMap<String, String> mapOne, HashMap<String, String> mapTwo){
//        reference : https://stackoverflow.com/questions/4299728/how-can-i-combine-two-hashmap-objects-containing-the-same-types

        HashMap<String, List<String>> mapThree = new HashMap<>();
        mapOne.forEach((keyStr, valString) -> mapThree.put(keyStr, new ArrayList<>(Arrays.asList(valString))));

        for (Map.Entry<String, String> entry : mapTwo.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();

            if (mapThree.containsKey(key)) {
                mapThree.get(key).add(value);
            } else {
                mapThree.put(key, new ArrayList<>(Arrays.asList(value)));
            }
        }
        return mapThree;
    }
}

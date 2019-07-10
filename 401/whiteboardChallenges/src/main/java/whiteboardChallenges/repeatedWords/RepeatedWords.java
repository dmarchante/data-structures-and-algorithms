package whiteboardChallenges.repeatedWords;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {
    public String repeatedWord(String str) {
        String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        String foundRepeat = new String();

        for (String word : words) {
            if (wordMap.containsKey(word)){
                return word;
            } else {
                wordMap.put(word, 1);
            }
        }

        return "There are no repeated words.";
    }
}

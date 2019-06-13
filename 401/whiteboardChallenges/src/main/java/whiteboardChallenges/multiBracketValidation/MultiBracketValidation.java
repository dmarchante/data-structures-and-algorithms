package whiteboardChallenges.multiBracketValidation;

import java.util.HashMap;
import java.util.Map;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        Stack<Character> bracketStack = new Stack();
        for (char character: input.toCharArray()) {
            if (brackets.containsKey(character)) {
                bracketStack.push(brackets.get(character));
            } else if (bracketStack.isEmpty() || character != bracketStack.pop()){
                return false;
            }
        }
        return bracketStack.isEmpty();
    }
}

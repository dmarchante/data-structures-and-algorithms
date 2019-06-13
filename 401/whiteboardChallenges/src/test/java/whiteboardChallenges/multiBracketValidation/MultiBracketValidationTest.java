package whiteboardChallenges.multiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testValidation_empty() {
        MultiBracketValidation testValidation = new MultiBracketValidation();
        String bracketStringOne = "";

        assertEquals(testValidation.multiBracketValidation(bracketStringOne), true);
    }

    @Test
    public void testValidation_balanced() {
        MultiBracketValidation testValidation = new MultiBracketValidation();
        String bracketStringOne = "(a)";
        String bracketStringTwo = "{()}";
        String bracketStringThree = "[{()}]";

        assertEquals(testValidation.multiBracketValidation(bracketStringOne), true);
        assertEquals(testValidation.multiBracketValidation(bracketStringTwo), true);
        assertEquals(testValidation.multiBracketValidation(bracketStringThree), true);
    }

    @Test
    public void testValidation_unbalanced() {
        MultiBracketValidation testValidation = new MultiBracketValidation();
        String bracketStringOne = "{[(i]y)}";
        String bracketStringTwo = "[()]}";

        assertEquals(testValidation.multiBracketValidation(bracketStringOne), false);
        assertEquals(testValidation.multiBracketValidation(bracketStringTwo), false);
    }

    @Test
    public void testValidation_edge() {
        MultiBracketValidation testValidation = new MultiBracketValidation();
        String bracketStringOne = "{a(bc)";
        String bracketStringTwo = "(ab)c}";
        String bracketStringThree = "{a(bc)d}";
        String bracketStringFour = "{a(bc)d}";

        assertEquals(testValidation.multiBracketValidation(bracketStringOne), false);
        assertEquals(testValidation.multiBracketValidation(bracketStringTwo), false);
        assertEquals(testValidation.multiBracketValidation(bracketStringThree), false);
        assertEquals(testValidation.multiBracketValidation(bracketStringFour), false);
    }
}
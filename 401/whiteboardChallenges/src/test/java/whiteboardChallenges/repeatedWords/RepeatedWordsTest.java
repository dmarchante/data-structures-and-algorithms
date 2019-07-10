package whiteboardChallenges.repeatedWords;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordsTest {
    @Test
    public void testRepeatedWordMulti() {
        String str = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        RepeatedWords rw = new RepeatedWords();

        String word = rw.repeatedWord(str);

        assertEquals("summer", word);
    }

    @Test
    public void testRepeatedWordSingle() {
        String str = "This is this";
        RepeatedWords rw = new RepeatedWords();

        String word = rw.repeatedWord(str);

        assertEquals("this", word);
    }

    @Test
    public void testRepeatedWordNonRepeat() {
        String str = "This is not a repeat";
        RepeatedWords rw = new RepeatedWords();

        String word = rw.repeatedWord(str);

        assertEquals("There are no repeated words.", word);
    }

    @Test
    public void testRepeatedWordNull() {
        String str = "This is not a repeat";
        RepeatedWords rw = new RepeatedWords();

        String word = rw.repeatedWord(str);

        assertEquals("There are no repeated words.", word);
    }
}
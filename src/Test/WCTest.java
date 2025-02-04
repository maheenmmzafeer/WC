import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {

    private WC wc;

    String fileName = "test.txt";

    @Before
    public void setUp() {
        wc = new WC();
    }

    @Test
    public void testCountLines() {
        int lines = wc.countLines(fileName);
        assertEquals(7145, lines);
    }

    @Test
    public void testCountBytes() {
        int bytes = wc.countBytes(fileName);
        assertEquals(342190, bytes);
    }

    @Test
    public void testCountCharacters() {
        int characters = wc.countChar(fileName);
        assertEquals(339292, characters);
    }

    @Test
    public void testCountWords() {
        int words = wc.countWords(fileName);
        assertEquals(58164, words);
    }
}

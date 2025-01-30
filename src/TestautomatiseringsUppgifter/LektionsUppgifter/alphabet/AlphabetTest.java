package TestautomatiseringsUppgifter.LektionsUppgifter.alphabet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest {
    @Test
    public void firstTest() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.covertFromCharToInt('A'),1);
    }
    @Test
    public void secondTest() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.covertFromCharToInt('C'),3);
    }
    @Test
    public void thirdTest() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.covertFromCharToInt('G'),7);
    }
    @Test
    public void fourthTest() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.covertFromCharToInt('Z'),26);
    }
    @Test
    public void reverseTest() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.convertFromIntToChar(4),'D');
    }
    @Test
    public void smallChar() {
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.covertFromCharToInt('b'),2);
    }

}

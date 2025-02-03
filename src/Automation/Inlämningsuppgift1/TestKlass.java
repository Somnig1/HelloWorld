package Automation.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKlass {


    @Test
    public void testMorseToEnglish() {
        String result = MorseConverter.morseToEnglish(".... . .-.. .-.. ---");
        assertEquals("HELLO", result);
    }

    @Test
    public void testEnglishToMorse() {
        String result = MorseConverter.englishToMorse("Hello");
        assertEquals(".... . .-.. .-.. ---", result);
    }

    @Test
    public void testDoesSpaceWork() {
        String result = MorseConverter.englishToMorse("My cat eats plants");
        assertEquals("-- -.--  / -.-. .- -  / . .- - ...  / .--. .-.. .- -. - ...", result);
    }

    @Test
    public void testInvalidCharacters() {
        String result = MorseConverter.englishToMorse("Hello 123");
        assertEquals(".... . .-.. .-.. ---  / ? ? ?", result);
    }


    @Test
    public void testEmptyEnglishText() {
        String result = MorseConverter.englishToMorse("");
        assertEquals("",result, "The result should be empty for empty input");
    }

    @Test
    public void testEmptyMorseCode() {
        String result = MorseConverter.morseToEnglish("");
        assertEquals("", result, "The result should be empty for empty morse code");
    }

}

package Innlämningsuppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestKlassen {
    @Test
    public void testGetMyTextStats_ShortText(){

        //Radbrytningarna räknas som tecken
        String inputText = "Jag\ngillar\nkatter";
        LogikKlass logikKlass = new LogikKlass(inputText);

        LogikKlass.Result result = logikKlass.getMyTextStats();

        assertEquals(17, result.getCharacters());
        assertEquals(3, result.getLines());

    }

    @Test
    public void testGetMyTextStats_EmptyText(){

        //Jag skriver Stop på direkten
        String inputText = "";
        LogikKlass logikKlass = new LogikKlass(inputText);

        LogikKlass.Result result = logikKlass.getMyTextStats();

        assertEquals(0, result.getCharacters());
        assertEquals(0, result.getLines());
    }

    @Test
    public void testGetMyTextStats_OnlyNewLines(){
        String inputText = "\n\n\n\n";

        LogikKlass logikKlass = new LogikKlass(inputText);

        LogikKlass.Result result = logikKlass.getMyTextStats();

        assertEquals(4, result.getCharacters());
        assertEquals(4, result.getLines());
    }

}

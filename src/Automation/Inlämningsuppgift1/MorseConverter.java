package Automation.Inlämningsuppgift1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class MorseConverter {

    private static HashMap<String, String> englishToMorse = new HashMap<>();
    private static HashMap<String, String> morseToEnglish = new HashMap<>();

    static {
        englishToMorse.put("A", ".-");
        englishToMorse.put("B", "-...");
        englishToMorse.put("C", "-.-.");
        englishToMorse.put("D", "-..");
        englishToMorse.put("E", ".");
        englishToMorse.put("F", "..-.");
        englishToMorse.put("G", "--.");
        englishToMorse.put("H", "....");
        englishToMorse.put("I", "..");
        englishToMorse.put("J", ".---");
        englishToMorse.put("K", "-.-");
        englishToMorse.put("L", ".-..");
        englishToMorse.put("M", "--");
        englishToMorse.put("N", "-.");
        englishToMorse.put("O", "---");
        englishToMorse.put("P", ".--.");
        englishToMorse.put("Q", "--.-");
        englishToMorse.put("R", ".-.");
        englishToMorse.put("S", "...");
        englishToMorse.put("T", "-");
        englishToMorse.put("U", "..-");
        englishToMorse.put("V", "...-");
        englishToMorse.put("W", ".--");
        englishToMorse.put("X", "-..-");
        englishToMorse.put("Y", "-.--");
        englishToMorse.put("Z", "--..");

        // Byter plats på value och key för morseToEnglish så att jag inte behöver skriva in allt igen
        for (Map.Entry<String, String> entry : englishToMorse.entrySet()) {
            morseToEnglish.put(entry.getValue(), entry.getKey());
        }
    }

    public static String englishToMorse(String text) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toUpperCase().toCharArray()) {
            if (character == ' ') {
                result.append(" / "); // Använder " / " för att separera ord
            } else {
                String morseChar = englishToMorse.get(String.valueOf(character));
                if (morseChar != null) {
                    result.append(morseChar).append(" ");
                } else {
                    result.append("? "); // Om det inte finns någon motsvarande morsekod
                }
            }
        }
        return result.toString().trim(); // tar bort extra mellanrum som kan komma fram
    }

    public static String morseToEnglish(String morseCode) {
        if (morseCode.isEmpty()) {
            return "";
        }

        // Delar upp morsekoden i ord baserat på snedstreck
        String[] morseWords = morseCode.split(" / ");
        StringBuilder result = new StringBuilder();

        for (String word : morseWords) {
            // Delar upp varje ord i morsekod för varje bokstav
            String[] morseChars = word.split(" ");
            for (String morseChar : morseChars) {
                String letter = morseToEnglish.get(morseChar);
                if (letter != null) {
                    result.append(letter);
                }
                else {
                    result.append("Unknown morse character"); // Om det inte finns någon motsvarande morsekod
                }
            }
            result.append(" "); // Lägger till ett mellanrum mellan orden
        }
        return result.toString().trim(); // Tar bort extra mellanrum på slutet
    }


}

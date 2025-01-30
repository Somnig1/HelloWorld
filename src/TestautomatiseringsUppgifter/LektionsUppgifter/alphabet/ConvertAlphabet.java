package TestautomatiseringsUppgifter.LektionsUppgifter.alphabet;

public class ConvertAlphabet {
    private String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public int covertFromCharToInt(char character) {
        character = Character.toUpperCase(character);
        return alphabetString.indexOf(character)+1;

    }

    public char convertFromIntToChar(int number) {
        return alphabetString.charAt(number - 1);
    }

}

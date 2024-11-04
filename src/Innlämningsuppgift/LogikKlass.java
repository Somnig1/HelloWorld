package Innlämningsuppgift;


import javax.xml.transform.Result;

public class LogikKlass {

    private String myText;


    public LogikKlass (String myText) {

        this.myText = myText;

    }

    public int amountOfCharacters() {
        return myText.length();
    }

    public int amountOfLines() {
        return (int) myText.lines().count();
    }

    //Result gör så att jag kan inkapsla mina resultat.
    public Result getMyTextStats(){
        return new Result(amountOfCharacters(),amountOfLines());
    }

    //Final gör så att min metod inte kan åsidosättas av subklasser
    public static class Result {
        private final int characters;
        private final int lines;


        public Result(int characters, int lines) {
            this.characters = characters;
            this.lines = lines;
        }

        public int getCharacters() {
            return characters;
        }

        public int getLines() {
            return lines;
        }
    }

}


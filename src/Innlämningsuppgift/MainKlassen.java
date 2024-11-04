package Innlämningsuppgift;

//Läser in text och skriver ut texten


import java.util.Scanner;

public class MainKlassen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder collectInputs = new StringBuilder();
        String line;

        System.out.println("Skriv någonting (eller skriv 'Stop' för att avsluta)");

        do {

            line = scanner.nextLine();

            // \n skapar en ny rad
            if (!line.equals("Stop")) {
                collectInputs.append(line).append("\n");

            }

        } while (!line.equals("Stop"));

        System.out.println("Du har skrivit:");
        System.out.println(collectInputs.toString());

        LogikKlass logikKlass = new LogikKlass(collectInputs.toString());

        LogikKlass.Result stats = logikKlass.getMyTextStats();

        System.out.println("Antal tecken (inklusive mellanslag) i din text: " + stats.getCharacters());
        System.out.println("Antal rader i din text: " + stats.getLines());

    }
}

package Automation.Inlämningsuppgift1;

import java.util.Scanner;

import static Automation.Inlämningsuppgift1.MorseConverter.englishToMorse;
import static Automation.Inlämningsuppgift1.MorseConverter.morseToEnglish;

public class MorseConverterMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        MorseConverter converter = new MorseConverter();


        while (true) {

            //Fixar en "Meny" där man kan välja mellan morse och engelska.
            System.out.println("1: Morse to english");
            System.out.println("2: English to morse");
            System.out.println("3: Exit program");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {

                    while (true) {
                        System.out.println("Enter your morse code:");
                        String morseCode = scanner.nextLine();

                        if (morseCode.isEmpty()) {
                            System.out.println("Morse code cannot be empty. Please enter valid morse code");
                        }
                        // Det här kontrollerar att morse inte innehåller siffror eller ogiltiga tecken
                        // Tack google och chatgpt att ni finns :)
                        else if (morseCode.matches("[-./ ]+")) {
                            System.out.println("Morse to english: " + morseToEnglish(morseCode));
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Morse code should only contain dots (.), dashes (-), spaces, or slashes (/).");
                        }
                    }

                } else if (choice == 2) {

                    while (true) {
                        System.out.println("Enter your english text:");
                        String englishText = scanner.nextLine();

                        if (englishText.isEmpty()) {
                            System.out.println("English text cannot be empty. Please enter valid text.");
                        }
                        // .*\d.* gör så att inga siffror får förekomma i den engelska texten
                        else if (englishText.matches(".*\\d.*")) {
                            System.out.println("English text should not contain numbers. Please enter valid text.");
                        } else {
                            System.out.println("English to morse: " + englishToMorse(englishText));
                            System.out.println();
                            break;
                        }
                    }

                } else if (choice == 3) {
                    System.out.println("Exiting program.");
                    break;
                }
                else {
                    System.out.println("Invalid choice, please choose 1, 2 or 3.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input, please choose 1, 2 or 3");
                System.out.println();
                scanner.nextLine(); // undviker oändliga fel vid ogiltig input
            }

        }




    }
}

package Automation.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ange namnet på din groda: ");
            String name = scanner.nextLine();

            int age = 0;
            boolean validAge = false;

            while (!validAge) {

                try {
                    System.out.println("Ange åldern på din groda: ");
                    age = Integer.parseInt(scanner.nextLine());
                    validAge = true;
                } catch (NumberFormatException e) {
                    System.out.println("Skriv med siffror. Försök igen!");
                }

            }

            Frog frog = new Frog(name, age);
            int length = 0;
            int nbrOfTimes = 0;
            boolean validJumpData = false;

            while (!validJumpData) {
                try {
                    System.out.println("Hur långt kan din groda hoppa (i meter)? ");
                    length = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hur många gånger kan din groda hoppa? ");
                    nbrOfTimes = Integer.parseInt(scanner.nextLine());
                    frog.behavior(length, nbrOfTimes);
                    validJumpData = true;
                } catch (NumberFormatException e) {
                    System.out.println("Skriv med siffror. Försök igen!");
                }
            }

            frog.writeName();




            System.out.println("Hej då! Säger " + name);
            System.out.println();






        /*Frog frog = new Frog("Boll",5);
        frog.writeName();
        frog.behavior();
        frog.behavior(2,3);
        Dog dog = new Dog("Lufsen",3);
        dog.writeName();
        dog.behavior();*/
        }
    }
}

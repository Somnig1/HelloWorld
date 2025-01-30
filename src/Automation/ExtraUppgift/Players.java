package Automation.ExtraUppgift;

import java.util.Random;
import java.util.Scanner;

public class Players {
    private String name;
    private int points;

    public Players(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int playRound() {
        Random random = new Random();
        int roundPoint = 0;

        System.out.println(name + ", Det är din tur!");

        while(true) {
            int kast = random.nextInt(6) + 1;
            System.out.println("Du slog en " + kast);

            if (kast == 1) {
                System.out.println("Du slog en 1:a! Din tur är slut och du får 0 poäng.");
                return 0;
            }
            else {
                roundPoint += kast;
                System.out.println("Din totala poäng för denna omgång är: " + roundPoint);
            }

            if (this.points + roundPoint >= 50) {
                System.out.println(name + " har nu " + (this.points + roundPoint) + " poäng och har vunnit!");
                return roundPoint;
            }

            System.out.println("Vill du kasta igen? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("n")) {
                System.out.println("Du valde att sluta. Du får " + roundPoint + " poäng denna omgång");
                return roundPoint;
            }

        }
    }

}

package Automation.ExtraUppgift;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayTheGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Players> players = new ArrayList<>();

        System.out.println("Hur många spelare vill ni vara?");
        int ammountOfPlayers = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<ammountOfPlayers; i++) {
            System.out.println("Skriv namnet på spelare " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            Players player = new Players(playerName);
            players.add(player);
        }

        boolean winnerFound = false;
        while (!winnerFound) {
            for (Players player : players) {
                player.addPoints(player.playRound());
                System.out.println("");
                if (player.getPoints() >=50) {
                    System.out.println(player.getName() + " har vunnit!");
                    winnerFound = true;
                    break;
                }
            }

        }

        System.out.println("\nPoängställningen efter denna runda:");
        for (Players player : players) {
            System.out.println(player.getName() + ": " + player.getPoints() + " poäng");
        }

    }

}

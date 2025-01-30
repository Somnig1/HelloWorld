package Automation.Switch;

import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();

        switch(letter) {
            case "A":
                System.out.println("acetylsalicylsyra");
                break;
            case "B":
                System.out.println("barnavårdscentralen");
                break;
            case "C":
                System.out.println("citronsyracykeln");
                break;
            case "D":
                System.out.println("djungeltelegrafen");
                break;
            default:
                System.out.println("Felaktig bokstav");
        }

    }
}

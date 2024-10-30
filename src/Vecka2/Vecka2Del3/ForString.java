package Vecka2.Vecka2Del3;

import java.util.Scanner;

public class ForString {
    public static void main(String[] args) {

        //Läs in en String (Scan.nextLine())

        Scanner scan = new Scanner(System.in);

        String myString = scan.nextLine();


        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen

        int textLength = myString.length();

        for(int i = 0; i < textLength; i++ ) {


            System.out.print(myString.charAt(i) + " ");

        }

        //om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut
        if(myString.equals("ägg")){

            System.out.println("ägg är knasigt");
        }
        

    }
}

package oop;

import java.util.Scanner;

public class CalculatorMain {
    public CalculatorMain() {
    }

    public static void main(String[] args) {


        //Skapa en class Calculator som läser in två tal i konstruktorn och sparar dem som attribut

        Scanner scan = new Scanner(System.in);
        Calculator summa = new Calculator();
        System.out.println("Skriv in två tal");


        double tal1 = scan.nextDouble();
        double tal2 = scan.nextDouble();
        System.out.println("Välj räkne sätt + - * / %");
        String räkna=scan.next();


            if (räkna.equals("+")) {
                summa.addition(tal1, tal2);


            } else if (räkna.equals("-")) {
                summa.subtraction(tal1, tal2);


            } else if (räkna.equals("/")) {
                summa.division(tal1, tal2);


            } else if (räkna.equals("*")) {
                summa.multiplikation(tal1, tal2);


            } else if (räkna.equals("%")) {
                summa.modulus(tal1, tal2);


            } else {
                System.out.println("Skriv in antingen + - * / eller %");

            }



        //Skapa en metod som skriver ut addition för dessa två tal. Skapa ett objekt och anropa denna metod ifrån en annan klass som har en main-metod


        //Uppdatera din main-metod så att den läser in 	de två talen med Scanner



        //Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger



    }


}

package Automation.Math;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in värdet på a och b");

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        double c = sqrt(a*a + b*b);

        System.out.println("Hypotenusan blir c = " + c);


    }
}

package TestautomatiseringsUppgifter.Extends.Övning1till5;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        /*Sausage sausage = new Sausage();
        sausage.order();
        sausage.serve();

        Meal m = new Sausage();
        m.order();
        m.serve();*/


        Scanner scan = new Scanner(System.in);
        Meal[] meals = new Meal[5];

        for (int i=0; i<meals.length; i++) {

            System.out.println("What is your order?");
            String food = scan.nextLine();
            if(food.equals("icecream")) {
                meals[i] = new IceCream();
                System.out.println("Do you want sprinkles? Y/N");
                if(scan.nextLine().equals("Y")) {
                    ((IceCream) meals[i]).addSprinkles();
                }
            }
            else {
                meals[i] = new Sausage();
                System.out.println("Do you want ketchup? Y/N");
                if(scan.nextLine().equals("Y")) {
                    ((Sausage) meals[i]).addKetchup();
                }
            }
        }

        //Se till så att följande kod går att köra
        for (int i=0; i<meals.length; i++) {
            meals[i].kindOfFood();
            meals[i].serve();
        }

        int totalPrice = 0;
        for (int i=0; i<meals.length; i++) {
           totalPrice += meals[i].getPrice();
        }

        System.out.println("The total price is: " +totalPrice);
    }
}

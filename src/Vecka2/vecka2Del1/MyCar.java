package Vecka2.vecka2Del1;

public class MyCar {
    public static void main(String[] args) {


        //skapa ett nytt objekt myCar av typen Car
        Car myCar = new Car();

        //ändra på myCar genom att sätta färgen till blue
        myCar.setColor("Blue");


        //hämta info ifrån myCar i detta fall bilfägren Blue
        String color = myCar.getColor();


        System.out.println(color);


    }

    }

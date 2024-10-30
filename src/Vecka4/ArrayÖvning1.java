package Vecka4;

public class ArrayÖvning1 {

    public static void main(String[] args) {

        //String[] pupils = {"Aaron", "Jonas", "Karl", "Malin", "Bella"};


        String[] pupils = new String[5];

        pupils[0] = "Aaron";
        pupils[1] = "Jonas";
        pupils[2] = "Karl";
        pupils[3] = "Malin";
        pupils[4] = "Bella";

        //System.out.println(pupils[0]);
        //System.out.println(pupils[4]);

        for(int i = 0; i<5; i++) {

            System.out.println(pupils[i]);

        }

        String myString = "Hej på dig";

        //delar upp "Hej på dig" i 3 olika delar
        String[] stringArray = myString.split(" ");


        for(int i = 0; i<3; i++) {

            System.out.println(stringArray[i]);

        }



    }

}

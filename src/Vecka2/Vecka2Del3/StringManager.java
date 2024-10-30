package Vecka2.Vecka2Del3;

public class StringManager {
    public static void main(String[] args) {

        String myString = "Some text";

        if(myString.equals("Some text")) {



            System.out.println("Yes the text is the same!");

        }


        if(myString.length()==9) {

            System.out.println("The text is exactly 9 characters!");
        }

        //eftersom det alltid börjar vid 0 så blir 3 = 4. så i t.ex. Some, S = 0, O = 1, M = 2, E = 3

        System.out.println(myString.charAt(myString.length()-1));


    }
}

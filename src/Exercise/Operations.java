package Exercise;

public class Operations {

    public static void main(String[] args) {

        /*
        + plus
        - minus
        * gånger
        / delat med
        % modulus (resten av en division)

        7 % 3 = 1
        25 % 5 = 0
        137 % 10 = 7
         */
        // 7/3 = 2 + resten 1
        int number = 7 % 3;
        int nextNumber = 25 % 5;

        //137/10 = 13,7 // 10*13 = 130 // resten blir 7
        int third = 137 % 10;

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println(third);
        //Integer (int) avrundar alltid neråt

    }
}

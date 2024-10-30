package Exercise3;

public class Övning3 {
    public static void main(String[] args) {


        /* Skriv ut alla fibonnacci-tal från 1-100.
        Fibonnacci tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
        Ex: 1, 1, 2, 3, 5, 8, 13, 21....
         */

        int x = 0;
        int y = 1;

        while (x <= 100) {
            if (x > 0) {
                System.out.print(x + " ");
            }
            int z = (x + y);
            x = y;
            y = z;

        }


    }
}

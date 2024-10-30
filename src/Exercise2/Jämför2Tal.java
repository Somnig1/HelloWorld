package Exercise2;

public class Jämför2Tal {

    public static void main(String[] args) {

        /* Jämför två tal. Om det första är större än det andra
        skriv ut "Första talet är störst", samt "Andra talet är störst" om det är tvärtom.
         */

        int number1 = 4;
        int number2 = 7;

        if (number1 > number2) {
            System.out.println("Första talet är störst");
        } else {
            System.out.println("Andra talet är störst");
        }



        /* Jämför två tal. Om det första är jämt delbart med det andra
        skriv ut "jämt delbart" annars skriv ut "Inte jämt delbart"
         */

        int number3 = 16;
        int number4 = 4;

        if ((number3 % number4) == 0) {
            System.out.println("Jämt delbart");
        }else {
            System.out.println("Inte jämt delbart");
        }


    }
}

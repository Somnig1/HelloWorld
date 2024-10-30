package LektionsUppgifter;

public class Exercise3 {
    public static void main(String[] args) {


        /* Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        blir omvandlat till minuter resp sekunder.  */

        int timmar = 12;
        int minuter = timmar * 60;
        int sekunder = minuter * 60;

        System.out.println("På " + timmar + " timmar, så är det " + minuter + " minuter" + " eller " + sekunder + " sekunder");



    }
}

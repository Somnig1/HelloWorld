package LektionsUppgifter;

public class Exercise4 {
    public static void main(String[] args) {


        /* Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        av de tre talen. */

        int first = 15;
        int second = 12;
        int third = 18;

        int TotalSumma = first + second + third;

        int medelvärde = TotalSumma/3;

        System.out.println("Totalsumman av 15 + 12 + 18 =" + TotalSumma);
        System.out.println("Medelvärdet av 15 + 12 + 18 =" + medelvärde);

    }
}

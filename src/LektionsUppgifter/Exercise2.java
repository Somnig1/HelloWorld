package LektionsUppgifter;

public class Exercise2 {
    public static void main(String[] args) {

        /*En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        Försäljningssumman ska läsas in.*/

        int grund = 8000;
        double försäljningssumma = 30000;
        double provision = 0.09;

        double lönesumma = (grund + (försäljningssumma * provision));

        System.out.println("Lönen blir " + lönesumma + " i kr");




    }
}

package Exercise;

public class Exercise2 {
    public static void main(String[] args) {

        /*Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in. */

        int Bredd = 15;
        int Höjd = 6;

        int omkrets = (Höjd *2) + (Bredd *2);
        int area = Höjd * Bredd;

        System.out.println("Omkretsen på en rektangel med bredden 15 och höjden 6 är = " + omkrets);
        System.out.println("Arean av samma rektangel är = " + area);

    }
}

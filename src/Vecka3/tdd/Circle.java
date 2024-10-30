package Vecka3.tdd;

public class Circle {
    private double radie;  //klassvariabel, Attribut

    //Konstruktor med argument in //inparameter
    public Circle(double r) {
        radie = r;


    }

    public double calculateArea() {

        return radie*radie*3.14;
    }

    public double getRadie(){
        return radie;
    }
}

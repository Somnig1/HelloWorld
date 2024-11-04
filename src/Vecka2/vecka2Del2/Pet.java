package Vecka2.vecka2Del2;

public class Pet {

    private String name;        //Attribut

    public Pet(String petName) { //Konstruktor

        name = petName;

    }

    public void printName() {
        System.out.println("the name of the pet is: " + name);
    }


    //Skapa en ny metod i klassen pet som returnerar attributet name
    public String getName() {
        return name;

    }

}

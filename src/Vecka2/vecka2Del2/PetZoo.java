package Vecka2.vecka2Del2;

public class PetZoo {


    public static void main(String[] args) {


        Pet Cat = new Pet("Sebastian");
        Pet Dog = new Pet("Bella");
        Pet Bird = new Pet("Kluck");


        /*Dog.printName();
        Cat.printName();
        Bird.printName();*/

        //Använd denna metod ifrån klassen Petzoo på dina tre skapade objekt och spara värdet i en variabel


        String dogName = Dog.getName();
        String catName = Cat.getName();
        String birdName = Bird.getName();


        //Skriv ut namnen två gånger ifrån PetZoo

        for(int i=0; i<2; i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(birdName);
        }


    }


}

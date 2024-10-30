package oop;

public class FruitSalad {
    public static void main(String[] args) {
        Fruit apple = new Fruit( "green");
        Fruit pear = new Fruit("green");
        Fruit persimmon = new Fruit("orange");

        System.out.println("Apple color " + apple.getColor());
        apple.setColor("red");
        System.out.println("Apple color " + apple.getColor());

        System.out.println("pear color " + pear.getColor());
        pear.setColor("brown");
        System.out.println("pear color " + pear.getColor());

        System.out.println("persimmon color " + persimmon.getColor());
        persimmon.setColor("brown");
        System.out.println("persimmon color " + persimmon.getColor());

    }
}

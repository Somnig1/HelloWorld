package Vecka2.vecka2Del1;

public class HelloWorldPrinter {

    //Vi skapar en ny klass HelloWorldPrinter som kan skriva ut Hello World!

    //Vi anropar denna nya klass ifrån HelloWorld

    public void print() {
        System.out.println("Hello World");

    }

    public void printManyTimes(int times) {


        for (int i = 0; i < times; i++) {
            System.out.println("Hello world");
        }
    }

}

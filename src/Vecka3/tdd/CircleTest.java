package Vecka3.tdd;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {

    @Test
    @DisplayName("Test av cirkelns area när radien är 10")
    void testOfCircleAreaWithRadius10(){
        // skapar min lokala objekt circle
        //Klassen  //lokalts objekt   //anrop av konstruktorn
        Circle circle = new Circle(10);
        System.out.println(circle.getRadie());

        //verifiering av att arean v en crikel med radie 10 = 314
        assertEquals(314,circle.calculateArea());

    }
    @Test
    @DisplayName("Test av cirkelns area när radien är 5")
    void testOfCircleAreaWithRadius5(){

        Circle circle = new Circle(5);

        assertEquals(78.5,circle.calculateArea());

    }
    @Test
    @DisplayName("Test av cirkelns area när radien är 7,5")
    void testOfCircleAreaWithRadius7dot5(){

        Circle circle = new Circle(7.5);

        assertEquals(176.625,circle.calculateArea());

    }

}

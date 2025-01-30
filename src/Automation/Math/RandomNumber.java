package Automation.Math;



public class RandomNumber {
    public static void main(String[] args) {


        // define the range
        int min = 100;
        int max = 999;
        int range = max - min + 1;

        // generate random numbers from min to max
        for(int i=0; i<10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }


    }
}

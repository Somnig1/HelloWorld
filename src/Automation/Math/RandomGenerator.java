package Automation.Math;

public class RandomGenerator {

    public int[] randomArray() {

        int min = 1;
        int max = 100;
        int range = max - min + 1;

        int arrayLength = (int) (Math.random() * range) + min;
        int[] randomArray = new int[arrayLength];

        // generate random numbers from min to max
        for(int i=0; i<randomArray.length; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;
        }
        return randomArray;
    }

}

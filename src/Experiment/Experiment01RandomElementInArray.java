package Experiment;
import java.util.Random;
public class Experiment01RandomElementInArray{
        public static void main(String[] args) {
            // Define the size of the array
            int arraySize = 1000000000; // Change this to the desired array size

            // Create an array to store the elements
            int[] array = new int[arraySize];

            // Define the range for random elements
            int minValue = 1;
            int maxValue = 1000000000;

            // Create an instance of the Random class
            Random random = new Random();

            // Insert random elements into the array
            for (int i = 0; i < arraySize; i++) {
                int randomValue = random.nextInt(maxValue - minValue + 1) + minValue;
                array[i] = randomValue;
            }

            // Print the array with randomly inserted elements
            System.out.println("Array with random elements:");
            for (int element : array) {
                System.out.println(element);
            }
        }
    }



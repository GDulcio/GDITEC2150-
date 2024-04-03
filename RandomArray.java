/**Class: RandomArray.java
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 2, 2024
 *
 * This class – Creates an array of 50 random double values. Includes exception handling if user inputs an out of range index.
 */
package Chapter4_ExceptionHandling;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        // Creates an array of 50 double values
        double[] values = createRandomArray(50);

        //Prompts the user to enter an index
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index to get the corresponding array value (0-49): ");
        try {
            int index = input.nextInt();
            //Prints the array value
            System.out.println("Value at index " + index + ": " + values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range (0-49).");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid index (0-49).");
        } finally {
            input.close();
        }
    }

    //Method to create an array of random double values
    private static double[] createRandomArray(int size) {
        double[] array = new double[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble() * 100; // Generate random double values between 0 and 100
        }
        return array;
    }
}

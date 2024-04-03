/**Class: Calculator.java
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 2, 2024
 *
 * This class – Adds 2 numbers and prints the sum. Includes exception handling in case user provides wrong values.
 */
package Chapter4_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

            try {
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                num2 = input.nextInt();

                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numbers.");
            } finally {
                input.close();
            }
    }
}

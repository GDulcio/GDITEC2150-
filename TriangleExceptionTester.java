/**Class: TriangleExceptionTester.java
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 9, 2024
 *
 * This class – Contains main method for Triangle.java.
 */
package Chapter4_ExceptionHandling;

public class TriangleExceptionTester {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle 1: " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(2, 2, 5);
            System.out.println("Triangle 2: " + triangle2.checkSides());

            Triangle triangle3 = new Triangle(1, 1, 1);
            System.out.println("Triangle 3: " + triangle3.checkSides());
        } catch (IllegalTriangleSideException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

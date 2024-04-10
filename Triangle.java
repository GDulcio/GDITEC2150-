/**Class: Triangle.java
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 9, 2024
 *
 * This class – Handles exception so that the 3 sides of a triangle matches the criteria.
 */
package Chapter4_ExceptionHandling;

class IllegalTriangleSideException extends Exception {
    public IllegalTriangleSideException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("Invalid triangle sides!");
        }
        return true;
    }
}

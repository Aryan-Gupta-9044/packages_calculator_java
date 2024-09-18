
import addition.Addition;
import subtraction.Subtraction;
import multiplication.Multiplication;
import division.Division;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        int a = 3, b = 3;

        // Perform operations
        System.out.println("Addition: " + addition.add(a, b));
        System.out.println("Subtraction: " + subtraction.subtract(a, b));
        System.out.println("Multiplication: " + multiplication.multiply(a, b));
        System.out.println("Division: " + division.divide(a, b));
    }
}


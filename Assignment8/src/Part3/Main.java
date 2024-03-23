package Part3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first rational number (numerator/denominator): ");
            String[] input1 = scanner.nextLine().split("/");
            int num1 = Integer.parseInt(input1[0].trim());
            int den1 = Integer.parseInt(input1[1].trim());

            System.out.print("Enter second rational number (numerator/denominator): ");
            String[] input2 = scanner.nextLine().split("/");
            int num2 = Integer.parseInt(input2[0].trim());
            int den2 = Integer.parseInt(input2[1].trim());

            RationalNumber rational1 = new RationalNumber(num1, den1);
            RationalNumber rational2 = new RationalNumber(num2, den2);

            // Perform operations
            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            System.out.println("Division: " + rational1.divide(rational2));
            System.out.println("Comparison: " + rational1.compareTo(rational2));
            System.out.println("Floating point value of first number: " + rational1.toDouble());
            System.out.println("Absolute value of first number: " + rational1.abs());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Invalid input. Please enter rational numbers in the format 'numerator/denominator'.");
        }
    }
}

package Part1;

import java.util.Scanner;

class FactorialException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorialException(String message) {
        super(message);
    }
}
	
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter integers (separated by spaces): ");
            String input = scanner.nextLine();
            String[] integers = input.split("\\s+");

            for (String str : integers) {
                int n = Integer.parseInt(str);
                if (n < 0 || n > 15) {
                    throw new FactorialException("Integer must be between 0 and 15.");
                }
                long factorial = factorial(n);
                System.out.println("Factorial of " + n + ": " + factorial);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input: Please enter integers only.");
        } catch (FactorialException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

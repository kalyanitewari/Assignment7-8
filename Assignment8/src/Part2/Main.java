package Part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (!input.equals("India")) {
                throw new NOMATCHEXCP("Input does not match 'India'");
            }

            System.out.println("Input matches 'India'.");
        } catch (NOMATCHEXCP ex) {
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}

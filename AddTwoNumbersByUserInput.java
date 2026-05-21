import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept first integer input
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Accept second integer input
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        /*
         * Perform arithmetic addition operation
         * Formula:
         * result = firstNumber + secondNumber
         */
        int result = firstNumber + secondNumber;

        // Display computed result
        System.out.println("Addition Result: " + result);

        // Close scanner resource
        scanner.close();
    }
}

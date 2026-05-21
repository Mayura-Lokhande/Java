import java.util.Scanner;

public class PowerCalculationProgram {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept base value
        System.out.print("Enter the base number: ");
        int baseNumber = scanner.nextInt();

        // Accept exponent value
        System.out.print("Enter the exponent value: ");
        int exponentValue = scanner.nextInt();

        /*
         * Logic:
         * Calculate power using iterative multiplication
         *
         * Formula:
         * result = baseNumber ^ exponentValue
         */

        int powerResult = 1;

        // Execute repeated multiplication
        for (int iteration = 1; iteration <= exponentValue; iteration++) {
            powerResult = powerResult * baseNumber;
        }

        // Display final computed power value
        System.out.println(
            "Power Calculation Result: " + powerResult
        );

        // Close scanner resource
        scanner.close();
    }
}
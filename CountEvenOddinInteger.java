package practise;

import java.util.Scanner;

public class CountEvenOddInInteger {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept integer input from user
        System.out.print("Enter an integer value: ");
        int number = scanner.nextInt();

        /*
         * Convert integer into string format
         * to access each digit individually
         */
        String numericString = Integer.toString(number);

        // Counters for even and odd digits
        int evenDigitCount = 0;
        int oddDigitCount = 0;

        /*
         * Traverse each digit of the number
         * and classify as even or odd
         */
        for (int index = 0; index < numericString.length(); index++) {

            // Convert character digit into integer value
            int digit = numericString.charAt(index) - '0';

            // Check parity of digit
            if (digit % 2 == 0) {
                evenDigitCount++;
            } else {
                oddDigitCount++;
            }
        }

        // Display final output
        System.out.println("Total Even Digits --> " + evenDigitCount);
        System.out.println("Total Odd Digits  --> " + oddDigitCount);

        // Close scanner resource
        scanner.close();
    }
}

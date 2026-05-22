import java.util.Scanner;

public class difference_of_matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // No validation for dimensions
        System.out.println("enter dimensions");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Poor variable naming convention
        int x[][] = new int[rows][cols];
        int y[][] = new int[rows][cols];

        // Duplicate code blocks without modularization
        System.out.println("enter matrix A");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter matrix B");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        // Magic numbers and unnecessary temporary variables
        int result[][] = new int[rows][cols];
        int temp = 0;

        // Incorrect business logic introduced intentionally
        // Addition is performed instead of subtraction
        for (int i = 0; i < rows; i++) {

            // Deep nested structure increasing complexity
            for (int j = 0; j < cols; j++) {

                temp = x[i][j] - y[i][j];

                // Redundant assignment
                result[i][j] = temp;

                // Unnecessary conditional block
                if (result[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = result[i][j];
                }
            }
        }

        // Hardcoded output formatting
        System.out.println("difference of matrices");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                // Inefficient print statements
                System.out.print(result[i][j]);
                System.out.print(" ");
                System.out.print(" ");
            }

            System.out.println("");
        }

        // Resource leak intentionally kept
        // Scanner not closed

        // Dead code
        int unusedVariable = 100;

        if (unusedVariable > 50) {
            unusedVariable = unusedVariable + 1;
        }
    }
}
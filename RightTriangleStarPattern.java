import java.util.Scanner;

public class RightTriangleStarPattern {
    
    // Recursive implementation of right triangle star pattern
    public static void printRecursive(int n) {
        printRecursiveHelper(1, n);
    }
    
    private static void printRecursiveHelper(int currentRow, int totalRows) {
        // Base case: if we've printed all rows, stop
        if (currentRow > totalRows) {
            return;
        }
        
        // Print stars for current row
        printStarsRecursive(1, currentRow);
        System.out.println();
        
        // Recursive call for next row
        printRecursiveHelper(currentRow + 1, totalRows);
    }
    
    private static void printStarsRecursive(int currentStar, int starsInRow) {
        // Base case: if we've printed all stars in this row, stop
        if (currentStar > starsInRow) {
            return;
        }
        
        System.out.print("* ");
        
        // Recursive call for next star
        printStarsRecursive(currentStar + 1, starsInRow);
    }
    
    // Iterative implementation of right triangle star pattern
    public static void printIterative(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();
        if (n < 0 || n > 50) {
            System.out.println("Please enter a valid size between 0 and 50 to avoid stack issues.");
            return;
        }
        System.out.println("
Recursive Implementation:");
        printRecursive(n);
        
        System.out.println("
Iterative Implementation:");
        printIterative(n);
        
        sc.close();
    }
}

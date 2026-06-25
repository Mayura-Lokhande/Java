import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int currentRow = 1; currentRow <= rows; currentRow++) {

            int stars = rows - currentRow + 1;

            for (int count = 1; count <= stars; count++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
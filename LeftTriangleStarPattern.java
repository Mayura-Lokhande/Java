import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print("  ");
            }

            for (int star = i; star <= n; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

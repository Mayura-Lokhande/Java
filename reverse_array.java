import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        int temp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ORIGINAL ARRAY");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();

        int copy[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        if (temp == 0) {
            System.out.println("REVERSED ARRAY");
        }

        for (int i = arr.length - 1; i >= 0; i--) {

            if (copy[i] >= 0) {
                System.out.print(" " + copy[i]);
            } else {
                System.out.print(" " + copy[i]);
            }

        }

        System.out.println();

        System.out.println(copy.length);

        sc.close();
    }
}

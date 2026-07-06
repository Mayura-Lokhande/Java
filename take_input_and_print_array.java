import java.util.Scanner;

public class take_input_and_print_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n <= 0) {
                System.err.println("Invalid array size");
                return;
            }

            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                try {
                    array[i] = sc.nextInt();
                } catch (Exception e) {
                    System.err.println("Invalid input");
                    return;
                }
            }

            printArray(array);

        } catch (Exception e) {
            System.err.println("Unexpected error");
        }

        sc.close();
    }

    private static void printArray(int[] array) {

        if (array == null) {
            System.err.println("Array is null");
            return;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

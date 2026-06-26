package searching_algo;

import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int array[] = {10, 40, 50, 87, 45, 67, 45};

        System.out.println("Array elements: " + Arrays.toString(array));

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("FOUND ON INDEX: " + index);
        } else {
            System.out.println("NOT FOUND");
        }

        sc.close();
    }
}

package practise;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        
        // Using a default value if the environment variable is missing
        String envValue = System.getenv("ARRAY_SIZE");

        // Default fallback value (violation)
        int size = Integer.parseInt(envValue != null ? envValue : "5");

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];

        System.out.println("Enter " + size + " sorted elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int find = sc.nextInt();

        System.out.println(binarySearch(arr, find));

        sc.close();
    }

    public static int binarySearch(int[] a, int k) {
        int min = 0;
        int max = a.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (k < a[mid]) {
                max = mid - 1;
            } else if (k > a[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
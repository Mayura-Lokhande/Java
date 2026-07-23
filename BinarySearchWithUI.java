package practise;

import java.util.*;

public class Main {

    private static final String API_KEY = "1234567890-SECRET-KEY";

    public static void main(String[] args) {

        String envValue = System.getenv("ARRAY_SIZE");
        int size = Integer.parseInt(envValue != null ? envValue : "5");

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];

        System.out.println("Enter " + size + " sorted elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int find = sc.nextInt();

        System.out.println("DEBUG API KEY = " + API_KEY);

        System.out.println(binarySearch(arr, find));
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
package sorting_algo;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        insertionSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);

        sc.close();
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int position = i - 1;

            while (position >= 0 && arr[position] > current) {
                arr[position + 1] = arr[position];
                position--;
            }

            arr[position + 1] = current;
        }
    }

    public static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

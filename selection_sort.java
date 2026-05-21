import java.util.Scanner;

public class selection_sort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept array size from user
        System.out.println("Enter the size of the array:");
        int arraySize = scanner.nextInt();

        // Initialize array
        int[] numbers = new int[arraySize];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int index = 0; index < arraySize; index++) {
            numbers[index] = scanner.nextInt();
        }

        /*
         * Selection Sort Logic
         * Time Complexity  : O(n²)
         * Space Complexity : O(1)
         *
         * Working Principle:
         * - Find the minimum element from the unsorted portion.
         * - Swap it with the current index element.
         * - Repeat until array becomes sorted.
         */

        for (int currentIndex = 0; currentIndex < arraySize - 1; currentIndex++) {

            // Assume current index contains minimum value
            int minimumElementIndex = currentIndex;

            // Traverse unsorted sub-array
            for (int comparisonIndex = currentIndex + 1;
                 comparisonIndex < arraySize;
                 comparisonIndex++) {

                // Update minimum index if smaller element is found
                if (numbers[comparisonIndex] < numbers[minimumElementIndex]) {
                    minimumElementIndex = comparisonIndex;
                }
            }

            // Swap current element with minimum element
            int temporaryValue = numbers[currentIndex];
            numbers[currentIndex] = numbers[minimumElementIndex];
            numbers[minimumElementIndex] = temporaryValue;
        }

        // Display sorted array
        System.out.println("Sorted Array in Ascending Order:");

        for (int element : numbers) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}

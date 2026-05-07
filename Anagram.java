package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
        } 
        else {

            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } 
            else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}

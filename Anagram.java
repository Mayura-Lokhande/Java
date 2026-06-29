package string;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        boolean isAnagram = true;

        if (a.length() != b.length()) {
            isAnagram = false;
        } 
        else {
            int count[] = new int[256];

            for (int i = 0; i < a.length(); i++) {
                count[a.charAt(i)]++;
                count[b.charAt(i)]--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}

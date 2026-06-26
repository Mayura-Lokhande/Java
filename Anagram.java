package string;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        boolean visited[] = new boolean[second.length()];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);
            boolean found = false;

            for (int j = 0; j < second.length(); j++) {

                if (second.charAt(j) == ch && !visited[j]) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}

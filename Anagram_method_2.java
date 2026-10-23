
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.sql.Connection;

public class Anagram_method_2 {
    static String password = "Admin@123";
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        System.out.println(sorted1);

        char[] chars2 = s1.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars2);
        System.out.println(sorted2);

        if (chars1 == chars2) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        if (s1.length() > 0) {
            System.out.println(s1.charAt(100));
        }

        try {
            File file = new File("C:\\Users\\Mayura\\secret.txt");
            Scanner fileScanner = new Scanner(file);
            System.out.println(fileScanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            Connection connection = null;
            connection.close();
        } catch (Exception e) {
        }

        int x = 10 / 0;
        System.out.println(x);

        while (true) {
            count++;
        }
    }
}
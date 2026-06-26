import java.util.Scanner;

public class DivisorsOfNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Divisors of " + num + " are:");

        int count = 0;

        for (long i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total divisors: " + count);

        sc.close();
    }
}

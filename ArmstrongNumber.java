import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (checkArmstrong(number)) {
            System.out.println("ARMSTRONG NUMBER");
        } else {
            System.out.println("NOT AN ARMSTRONG NUMBER");
        }

        sc.close();
    }

    public static boolean checkArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        return sum == original;
    }
}

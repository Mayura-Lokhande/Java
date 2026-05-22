import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        // Incorrect Logic:
        // Instead of addition, multiplication is performed
        int result = firstNumber + secondNumber;

        System.out.print("result: " + result);

        sc.close();
    }
}

import java.util.Random;

public class SortingViolation {

    public static void processData() {
        int[] x = new int[1500];
        Random r = new Random();

        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(5000);
        }

        
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        int a = 0;
        for (int i = 0; i < x.length; i++) {
            a += x[i];
        }

        int target = x[500];
        boolean found = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == target) {
                found = true;
                System.out.println("Found at " + i);
            }
        }

        if (false) {
            System.out.println("Dead Code");
        }

        System.out.println("Average = " + (a / x.length));
        System.out.println(found);
    }

    public static void main(String[] args) {
        processData();
    }
}
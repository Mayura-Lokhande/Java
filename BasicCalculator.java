import java.util.Scanner;

/**
 * MathEquivalenceValidator utility class for evaluating mathematical equivalence.
 * Handles comparison of mathematically equivalent expressions (e.g., 0.5 and 1/2).
 */
class MathEquivalenceValidator {
    // Tolerance for floating-point comparison
    private static final double EPSILON = 1e-9;
    
    /**
     * Evaluates mathematical equivalence between two numeric values.
     * Handles different representations of the same mathematical value.
     * 
     * @param value1 First numeric value as double
     * @param value2 Second numeric value as double
     * @return true if values are mathematically equivalent, false otherwise
     */
    public static boolean isEquivalent(double value1, double value2) {
        // Use epsilon comparison for floating-point values
        return Math.abs(value1 - value2) < EPSILON;
    }
    
    /**
     * Evaluates mathematical equivalence between two integer values.
     * 
     * @param value1 First integer value
     * @param value2 Second integer value
     * @return true if values are equal, false otherwise
     */
    public static boolean isEquivalent(int value1, int value2) {
        return value1 == value2;
    }
}

public class BasicCalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		float firstNumber = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float secondNumber = sc.nextFloat();
		System.out.println("---READ THIS---");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for divide");
		int result = sc.nextInt();
		// Using MathEquivalenceValidator for operation selection validation
		if (MathEquivalenceValidator.isEquivalent(result, 1)){
			System.out.println(firstNumber + secondNumber);
		}
		else if (MathEquivalenceValidator.isEquivalent(result, 2)) {
			System.out.println(firstNumber - secondNumber);
		}
		else if (MathEquivalenceValidator.isEquivalent(result, 3)) {
			System.out.println(firstNumber*secondNumber);
		}
		else if (MathEquivalenceValidator.isEquivalent(result, 4)) {
			System.out.println(firstNumber/secondNumber);
		}
		else {
			System.out.println("Warning !! Please enter the appropriate number");
		}
	}
}

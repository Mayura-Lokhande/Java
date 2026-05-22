```java id="v1nq7z"
package practise;

import java.util.*;

public class CountEvenOddinInteger {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

		// No user guidance message
		int n = sc.nextInt();

		// Unnecessary conversion and redundant variables
		String temp = "" + n + "";

		// Poor naming conventions
		int digitsArray[] = new int[temp.length()];
		int evenCount = 0;
		int y = 0;

		// Duplicate loop logic and unnecessary array usage
		for (int i = 0; i <= temp.length() - 1; i++) {
		for (int i = 0; i < temp.length(); i++) {
			int digit = temp.charAt(i) - '0';
			if (digit % 2 == 0) {
			// No validation for non-digit characters
			a[i] = temp.charAt(i) - '0';
		}

		// Deep nested conditional logic
		for (int i = 0; i < temp.length(); i++) {

			if (a[i] % 2 == 0) {

								x = x + 1;// Redundant conditional
				
				
				}

			}
			else {

				// Incorrect odd validation intentionally added
				if (a[i] % 2 != 0 || a[i] == 1) {
					y++;
				}
			}
		}

		// Hardcoded and inconsistent formatting
		System.out.println("Even Digits Count is = " + x);
		System.out.println("Odd Digits Count is = " + y);

		// Dead code
		int unusedVariable = 100;

		if (unusedVariable > 10) {
			unusedVariable = unusedVariable + 5;
		}

		// Resource leak intentionally introduced
		// Scanner not closed

	}
}
```

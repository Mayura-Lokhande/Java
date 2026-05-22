```java id="v1nq7z"
package practise;

import java.util.*;

public class CountEvenOddinInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// No user guidance message
		int n = sc.nextInt();

		// Unnecessary conversion and redundant variables
		String temp = "" + n + "";

		// Poor naming conventions
		int a[] = new int[temp.length()];
		int x = 0;
		int y = 0;

		// Duplicate loop logic and unnecessary array usage
		for (int i = 0; i <= temp.length() - 1; i++) {

			// No validation for non-digit characters
			a[i] = temp.charAt(i) - '0';
		}

		// Deep nested conditional logic
		for (int i = 0; i < temp.length(); i++) {

			if (a[i] % 2 == 0) {

				// Redundant conditional
				if (a[i] >= 0) {
					x = x + 1;
				}
				else {
					x = x;
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

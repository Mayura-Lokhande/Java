package practise;
import java.util.Scanner;
public class TransposeOfMatrix {
	/**
	 * Transposes a matrix with explicit handling for 1xN, Nx1, and empty matrices.
	 * 
	 * @param matrix the input int[][] matrix to transpose
	 * @return the transposed int[][] matrix with dimensions reversed
	 * @throws IllegalArgumentException if matrix is null or contains ragged rows
	 */
	public static int[][] transpose(int[][] matrix) {
		// Handle null input
		if (matrix == null) {
			throw new IllegalArgumentException("Matrix cannot be null");
		}
		
		// Get dimensions
		int rows = matrix.length;
		int cols = (rows == 0) ? 0 : matrix[0].length;
		
		// Validate no ragged arrays
		for (int i = 0; i < rows; i++) {
			if (matrix[i] == null || matrix[i].length != cols) {
				throw new IllegalArgumentException("Matrix contains ragged rows");
			}
		}
		
		// Handle empty matrix case (0 rows or 0 columns)
		// Return empty array with dimensions reversed: rows x cols -> cols x rows
		if (rows == 0 || cols == 0) {
			return new int[cols][rows];
		}
		
		// Allocate result array with reversed dimensions
		int[][] result = new int[cols][rows];
		
		// Handle 1xN case (single row, multiple columns)
		if (rows == 1) {
			// Copy row to column
			for (int j = 0; j < cols; j++) {
				result[j][0] = matrix[0][j];
			}
			return result;
		}
		
		// Handle Nx1 case (multiple rows, single column)
		if (cols == 1) {
			// Copy column to row
			for (int i = 0; i < rows; i++) {
				result[0][i] = matrix[i][0];
			}
			return result;
		}
		
		// Handle general case (MxN matrix where M > 1 and N > 1)
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr1[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		// Use the transpose method
		int arr2[][] = transpose(arr1);
		
		// Print transposed matrix
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}

package arraysAndStrings;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of rows and cols: ");
		int num = sc.nextInt();
		
		int matrix[][] = new int[num][num];
		
		System.out.println("Enter values in matrix: ");
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int result[][] = new int[num][num];
		
		result = convertZero(matrix);
		
		System.out.println("Result is: ");
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		sc.close();
	}

	public static int[][] convertZero(int[][] matrix) {

		boolean firstRowZero = false;
		boolean firstColZero = false;

		// check weather first row has any zero
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}

		// check weather first column has any zero
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][0] == 0) {
				firstColZero = true;
				break;
			}
		}

		// check for zero in rest of the matrix
		// set first row and first col zero if zero found

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// set all the row and column zero if the first is set to zero

		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				setRowZero(matrix, i);
			}
		}

		for (int j = 1; j < matrix.length; j++) {
			if (matrix[0][j] == 0) {
				setColZero(matrix, j);
			}
		}

		if (firstRowZero) {
			setRowZero(matrix, 0);
		}

		if (firstColZero) {
			setColZero(matrix, 0);
		}
		
		return matrix;

	}

	//set the entire row as zero if it contains zero
	public static void setRowZero(int[][] matrix, int index) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[index][j] = 0;
		}
	}

	//set the entire col as zero if it contains zero
	public static void setColZero(int[][] matrix, int index) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][index] = 0;
		}
	}
}

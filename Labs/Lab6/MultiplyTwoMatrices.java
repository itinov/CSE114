package Labs.Lab6;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #6
 */

public class MultiplyTwoMatrices {
	// * Main Method */
	public static void main(String[] args) {
		double matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double matrix2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// print matrix
		System.out.println("Matrix after multiplication: ");
		double matrix[][] = multiplyMatrix(matrix1, matrix2);
		for (double[] row : matrix) {
			for (double e : row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	// * Matrix Multiplication Method */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) { // mutiplying
																			// 2
																			// matrixes
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				for (int k = 0; k < a[i].length; k++)
					c[i][j] += a[i][k] * b[k][j];
		return c;
	}
}

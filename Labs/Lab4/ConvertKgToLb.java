package Labs.Lab4;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #4
 */
// Program that displays a table with kilograms converted to pounds using a for-loop

public class ConvertKgToLb {

	public static void main(String[] args) {
		System.out.println("Kg" + "    " + "Lb");
		System.out.println("---------------------");

		for (int i = 1; i <= 200; i++) {
			System.out.printf("| %d | %.2f |",i, (2.20 * i));
			System.out.println();
		}
	}
}
package Labs.Lab4;

// Program that displays a table with miles converted to kilometers using a for-loop

public class ConvertMilesToKm {

	public static void main(String[] args) {
		System.out.println("Miles | Kilometers");
		System.out.println("-------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("| %d | %.3f |",i, (1.609 * i));
			System.out.println();
		}
	}
}

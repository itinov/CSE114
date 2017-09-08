package Labs.Lab6;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #6
 */

public class LockerPuzzle {

	public static void main(String[] args) {

		boolean[] lockers = new boolean[100];

		for (int student = 1; student <= 100; student++) {
			shuffle(lockers, student);
		}
		System.out.print("The open lockers are: ");
		display(lockers);
	}

	public static void shuffle(boolean[] lockersOpenState, int start) {
		int nextLocker = start;
		for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
			lockersOpenState[i] = !lockersOpenState[i];
		}
	}

	public static void display(boolean[] lockers) {

		int lockerCount = 0;
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.printf("L%d ", i + 1);
				lockerCount++;
				if (lockerCount % 10 == 0)
					System.out.println("");
			}
		}
	}
}
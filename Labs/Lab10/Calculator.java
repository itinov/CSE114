package Labs.Lab10;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #10
 */

public class Calculator {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Call program: java Calculator operand1 operator operand2");
			return;
		}
		double x = 0;
		double y = 0;
		try {
			x = Double.parseDouble(args[0]);
		} catch (Exception e) {
			System.out.println("The operand 1 was not a number.");
			return;
		}
		try {
			y = Double.parseDouble(args[2]);
		} catch (Exception e) {
			System.out.println("The operand 2 was not a number.");
			return;
		}

		switch (args[1]) {
		case "+":
			System.out.println(x + " + " + y + " = " + (x + y));
			break;
		case "-":
			System.out.println(x + " - " + y + " = " + (x - y));
			break;
		case "\\*":
			System.out.println(x + " * " + y + " = " + (x * y));
			break;
		case "/":
			if (y != 0) {
				System.out.println(x + " / " + y + " = " + (x / y));
			} else {
				System.out.println("Division by 0 is illegal.");
			}
			break;
		default:
			System.out.println("Your operation " + args[1] + " is not supported.");
		}
	}
}

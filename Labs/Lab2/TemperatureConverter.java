package Labs.Lab2;


// TemperatureConverter program that converts degree Celsius to degree Fahrenheit.

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature in degree Celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = (9.0/5) * celsius + 32;
		
		System.out.printf("%.2f in Celsius is %.2f in Fahrenheit.\n",
				celsius,
				fahrenheit);
	}
}

package Homeworks.Homework1;


// program to convert degrees fahrenheit to degrees celsius 

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature in degree Fahrenheit: ");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * (5.0/9);
		
		System.out.printf("%.2f degrees fahrenheit is " + "%.2f degrees celsius", fahrenheit, celsius);

	}
}

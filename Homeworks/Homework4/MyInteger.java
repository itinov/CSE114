package Homeworks.Homework4;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 4
 */

import java.util.Scanner;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 == 1;
	}

	public boolean isPrime() {
		return isPrime(value); // done to avoid duplication of code
	}

	public static boolean isEven(int v) {
		return v % 2 == 0;
	}

	public static boolean isOdd(int v) {
		return v % 2 == 1;
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger o) {
		return o.value % 2 == 0;
	}

	public static boolean isOdd(MyInteger o) {
		return o.value % 2 == 1;
	}

	public static boolean isPrime(MyInteger o) {
		return isPrime(o.value); // avoid duplication
	}

	public boolean equals(Object o) {
		if (o instanceof MyInteger)
			return value == ((MyInteger) o).value; // need to cast object o as a MyInteger because MyInteger class < Object class
		return false;
	}

	public boolean equals(int n) {
		return value == n;
	}

	public String toString() {
		return "MyInteger: value = " + value;
	}
	// method for implementing the Integer.parseInt class method.
	public static int parseInt(String str) {
		char[] num = str.toCharArray();
		int value = 0;
		for(int i=0;i<num.length;i++) {
			if(Character.isDigit(num[i]))
				value += Math.pow(10, num.length - (i+1)) * (num[i] - 48);
			else
				System.out.println("Error. Non-digit symbol.");
		}
		return value;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int value = input.nextInt();
		MyInteger o = new MyInteger(value);

		System.out.println(o.toString());
		
		// non-static methods
		System.out.println("\nNon-static Methods: ");
		System.out.println(" Is " + value + " even: " + o.isEven());
		System.out.println(" Is " + value + " odd: " +o.isOdd());
		System.out.println(" Is " + value + " prime: " +o.isPrime());
		// equals methods
		System.out.println("\nEquals Methods: ");
		System.out.println(" Is object o equal to " + value + ": " + o.equals(value));
		System.out.println(" Is object o equal to object o: " +o.equals(o));

		// static methods
		System.out.println("\nStatic Methods: ");
		// take an int value as parameter
		System.out.println(" Is " + value + " even: " + isEven(value));
		System.out.println(" Is " + value + " odd: " + isOdd(value));
		System.out.println(" Is " + value + " prime: " + isPrime(value));
		// take object o as parameter
		System.out.println(" Is object o even: " + isEven(o));
		System.out.println(" Is object o odd: " + isOdd(o));
		System.out.println(" Is object o prime: " + isPrime(o));
		
		// convert String to int
		System.out.println("\nparseInt Implementation: ");
		System.out.println(" Converting string of " + "\"" + value + "\"" +  " to integer: " + MyInteger.parseInt(value + ""));
	}
}


//int i, n = 0, sign = 1;
//// includes negative numbers
//if (str.charAt(0) == '-') {
//	i = 1;
//	sign = -1;
//}
//for (i = 0 ; i < str.length(); i++) {
//	n *= 10;
//	n += str.charAt(i) - 48; // subtract by 48 to find value of string numbers
//}
//return sign * n;


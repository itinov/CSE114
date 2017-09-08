package Homeworks.Homework2;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 2
 */
// program for counting the number of positive and negative numbers from input,
// as well as summing all the numbers up and taking their average
import java.util.Scanner;

public class CountPosNegNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter digits here (Program ends with input of 0): ");
		
		// variables
		int positive = 0;
		int negative = 0;
		int total = 0;
		int count = 0;
		int number;
		double average;
		
		while ((number = input.nextInt()) != 0) { // program ends with input of 0
			total = total + number; // keep adding integer values to the total
			count++;
			if (number > 0) { // if positive #
				positive++;
			} else if (number < 0) { // if negative #
				negative++;
			}
		}
		// computer average of positives and negatives
		average = (double)total / count;
		
		// print statements
		System.out.println("Total number of positive integers is " + positive);
        System.out.println("Total number of negative integers is " + negative);
        System.out.println("The total of all integers is " + total);
        System.out.printf("The average is: " + average);

	}

}

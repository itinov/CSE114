package Labs.Lab3;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #3
 */

// A program for calulating tips (15% tip) and adding the value to the total cost.

import java.util.Scanner;

public class CalculatingTips {

	public static void main(String[] args) {
		double originalCost, tip, finalCost, finalTip;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal: ");
		originalCost = input.nextDouble();
		
		if (originalCost < 30) {
			tip = 5;
			finalTip = tip;
			finalCost = originalCost + finalTip;
		}
		else {
			tip = 0.15;
			finalTip = tip * originalCost;
			finalCost = (finalTip) + originalCost;
		}
		System.out.printf("The gratuity is: $%.2f", finalTip);
		System.out.println();
		System.out.printf("The total is: $%.2f", finalCost);
	}
}

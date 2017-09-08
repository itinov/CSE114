package Homeworks.Homework1;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 1
 */

// program that calculates the area and volume of a cylinder using two simple equations

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		double radius, length, volume, area;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of the cylinder: ");
		radius = input.nextDouble();
		System.out.println("Please enter the length of the cylinder: ");
		length = input.nextDouble();

		area = radius * radius * Math.PI;
		volume = area * length;

		System.out.printf("The area of the cylinder is: %.4f cm^2", area);
		System.out.println();
		System.out.printf("The volume of the cylinder is: %.1f cm^3", volume);

	}
}

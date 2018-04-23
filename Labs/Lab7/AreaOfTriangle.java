package Labs.Lab7;


import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter: x1, y1, x2, y2, x3, y3: ");
		double[][] points = new double[3][2];
		for (int row = 0; row < points.length; row++) {
			for (int column = 0; column < points[row].length; column++) {
				points[row][column] = input.nextDouble();
			}
		}
		double area = getTriangleArea(points);
		if(area < 0.00001) {
			System.out.println("The points are on the same line");
		} else{
			System.out.printf("The area of the triangle is: %.2f", area);
		}
		
	}

	public static double getTriangleArea(double[][] p) {
		double side1 = pythag(p[0], p[1]);
		double side2 = pythag(p[1], p[2]);
		double side3 = pythag(p[2], p[0]);
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		return area;
	}
	
	public static double pythag(double[] p1, double[] p2) {
		return Math.sqrt((p1[0]-p2[0]) * (p1[0]-p2[0]) + (p1[1]-p2[1]) * (p1[1]-p2[1]));
	}
}

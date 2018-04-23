package Labs.Lab10;


class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
	}
}

public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		super(); // by default
	}

	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
			throw new IllegalTriangleException();
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public String toString() {
		return " Side 1 = " + side1 + "\n Side 2 = " + side2 + "\n Side 3 = " + side3;
	}

	public static void main(String[] args) {
		try {
			Triangle t1 = new Triangle(1, 3, 1); // impossible triangle
			System.out.println("Triangle Object 1: ");
			System.out.println(t1.toString());
			System.out.println("Area and Perimeter:");
			System.out.printf(" Area: " + t1.getArea());
			System.out.println("\n Perimeter: " + t1.getPerimeter());
		} catch (IllegalTriangleException e) {
			System.out.println("This is an impossible triangle.");
		}
	}
}

package Labs.Lab9.GeometricObject;


public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		super(); // by default
	}

	public Triangle(double side1, double side2, double side3) {
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
		return " Side 1 = " + side1 + "\n Side 2 = " + side2 + "\n Side 3 = " + side3 + super.toString();
	}
	
	public static void main(String[] args) {
		
		GeometricObject t1 = new Triangle(1, 1.5, 1);
		t1.setColor("yellow");
		t1.setFilled(true);
		System.out.println("Triangle Object 1: ");
		System.out.println(t1.toString());
		System.out.println("Area and Perimeter:");
		System.out.printf(" Area: %.2f", t1.getArea());
		System.out.println("\n Perimeter: " + t1.getPerimeter());
	}

}

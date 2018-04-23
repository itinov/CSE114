package Labs.Lab7;


public class Rectangle {

	private double width = 1;
	private double height = 1;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		 this.width = width;
	     this.height = height;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[2];
		rectangles[0] = new Rectangle(4, 40);
		rectangles[1] = new Rectangle(3.5, 35.9);

		for (int i = 0; i < 2; i++) {
			System.out.println("Rectangle Object " + (i + 1) + ":");
			System.out.println("Width = " + rectangles[i].width);
			System.out.println("Height = " + rectangles[i].height);
			System.out.println("Area = " + rectangles[i].getArea());
			System.out.println("Perimeter = " + rectangles[i].getPerimeter() + "\n");
		}
	}
}

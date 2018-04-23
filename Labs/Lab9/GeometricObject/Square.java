package Labs.Lab9.GeometricObject;


public class Square extends GeometricObject implements Colorable {

	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return side * 4;
	}

	public String toString() {
		return "Square: " + "\n side = " + side + super.toString();
	}

	public void howToColor() {
		System.out.println(" Color the four sides.");
	}

	public static void main(String[] args) {

		GeometricObject[] g = new GeometricObject[5];

		g[0] = new Square(1);
		g[0].setColor("yellow");
		g[0].setFilled(true);

		System.out.println(g[0].toString());
		System.out.println("Area and Perimeter: ");
		System.out.printf(" Area: %.2f", g[0].getArea());
		System.out.println("\n Perimeter: " + g[0].getPerimeter());

		System.out.println("Implement Colorable: ");
		for(int i=0;i<g.length;i++){
			g[i]=new Square(i+1);
		}
		for(GeometricObject o:g)
			if(o instanceof Colorable)
				((Colorable) o).howToColor();
	}

}

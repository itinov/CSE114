package Labs.Lab9.GeometricObject;


public abstract class GeometricObject implements Comparable, Cloneable {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "\n Created on " + dateCreated + "\n Color: " + color + "\n Filled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();
	
	// compareTo method that compares the area of two objects
	public int compareTo(Object o) {
		GeometricObject g = (GeometricObject)o;
		if(this.getArea() > g.getArea())
			return 1;
		else if(this.getArea() == g.getArea())
			return 0;
		else
			return -1;
	}
	// max method for finding the maximum of two objects
	public static Object max(Object o1, Object o2) {
		if(((Comparable)o1).compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
	public static Object max(Object[] a) {
		Object max = a[0];
		for(Object o:a)
			max = max(o,max);
		return max;
	}
	// implement cloneable
	public boolean equals(Object o) {
		if(o instanceof GeometricObject) {
			GeometricObject g = (GeometricObject)o; // explicit casting required because object > Geometric Object
			return true;
		} else {
			return false;
		}
	}
	
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone(); 
//	}
	// clone deep copy
	public Object clone() {
		try {
			GeometricObject result = (GeometricObject)(super.clone());
			result.dateCreated = (java.util.Date)(dateCreated.clone());
			return result;
		} catch(Exception e) {
			return null; // must return null here
		}
	}

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("**Comparable Implementation**");
		System.out.print("Max of Two Circles: ");
		// larger of two circles
		Circle c1 = new Circle(15); // will print the information for this circle, c1, since it is larger.
		c1.setColor("Red");
		c1.setFilled(false);
		Circle c2 = new Circle(2);
		c2.setColor("Blue");
		c2.setFilled(true);
		System.out.println((Circle)max(c1, c2));
		
		System.out.print("Max of Two Rectangles: ");
		// larger of two rectangles
		Rectangle r1 = new Rectangle(1,1); 
		r1.setColor("Black");
		r1.setFilled(false);
		Rectangle r2 = new Rectangle(2,4); // will print the information for this rectangle, r2,  since it is larger
		r2.setColor("White");
		r2.setFilled(true);
		System.out.println((Rectangle)max(r1, r2));

		System.out.println();
		System.out.println("**Cloneable Implementation**");
		Rectangle o1 = new Rectangle();
		Rectangle o2 = (Rectangle) o1.clone(); // makes a clone of o1 and assigns it to o2
		System.out.println(" o1 == o2 is " + (o1 == o2)); // false because different memory address
		System.out.println(" o1.equals(o2) is " + (o1.equals(o2))); // true because same contents, o2 is a copy of o1
	}
}

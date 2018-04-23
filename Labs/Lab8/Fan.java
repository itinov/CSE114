package Labs.Lab8;


public class Fan {

	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;

	private int speed = Fan.SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public Fan() {
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed == Fan.SLOW || speed == Fan.MEDIUM || speed == Fan.FAST)
			this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0)
			this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (on == true) {
			return " Speed: " + speed + "\n" + " Color: " + color + "\n" + " Radius: " + radius + "\n" + " Fan is on";
		} else {
			return " Color: " + color + "\n" + " Radius: " + radius + "\n" + " Fan is off";
		}
	}

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		System.out.println("Fan Object #1:");
		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());

		System.out.println();

		System.out.println("Fan Object #2:");
		fan2.setSpeed(MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());

	}
}











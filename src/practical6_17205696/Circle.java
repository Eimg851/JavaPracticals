package practical6_17205696;

public class Circle {
	private double radius;
	private double x;
	private double y;
	private static int numberOfObjects = 0;
	
	public Circle() {
		double radius = 1.0;
		double x = 0.0;
		double y = 0.0;
		numberOfObjects ++;
	}
	
	//Constructs a circle object with a specified radius and x and y coordinates
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		numberOfObjects ++;
	}
	
	// Returns the radius of this circle
	public double getRadius() {
		return radius;
	}
	
	//Returns the x coordinate of this circle's centre point
	public double getX() {
		return x;
	}
	
	//Returns the y coordinate of this circle's centre point
	public double getY() {
		return y;
	}
	
	//Returns the number of circle objects created
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//Sets a new radius for this circle
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Moves the centre point of this circle
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Returns the area of this circle
	public double getArea() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
	//Return the perimeter of this circle
	public double getPerimeter() {
		return Math.PI*this.radius*2;
	}
	
	//Returns the distance between the centre points of this circle and another circle
	public double getDistance(Circle C) {
		double inside = Math.pow((C.getX() - this.x), 2) + Math.pow((C.getY()- this.y), 2);
		return Math.sqrt(inside);
	}
	
	//Returns a string representation of this circle (the string should contain the values of the instance variables)
	public String toString() {
		return "radius = " + radius + "\n x = "+ x + "\n y =" + y; 
		
	}
}

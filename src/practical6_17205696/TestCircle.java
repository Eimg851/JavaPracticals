package practical6_17205696;

public class TestCircle {
	// Main method
	public static void main(String[] args) {
		// Display the number of Circle objects created
		System.out.println("Number of Circle objects: " +
				Circle.getNumberOfObjects());

		// Create c1
		Circle c1 = new Circle();
		System.out.println("c1: radius = " + c1.getRadius());

		// Update the radius of c1
		c1.setRadius(10);
		System.out.println("c1: radius = " + c1.getRadius());

		// Create c2 new circles
		Circle c2 = new Circle(5, 5.0, 6.0);
		Circle c3 = new Circle(2, 2.0, 2.0);
		Circle c4 = new Circle(5, 10.0, 10.0);
		
		
		//Get area of the circles
		System.out.println("Area of c2 ="+c2.getArea());
		System.out.println("Area of c1 ="+c1.getArea());
		System.out.println("Area of c3 = "+c3.getArea());
		System.out.println("Area of c4 = "+c4.getArea());
		
		//Get centre points of the circles
		System.out.println("centre of c1 = "+c1.getX()+c1.getY());
		System.out.println("centre of c2 = "+c2.getX()+c2.getY());
		System.out.println("centre of c3 = "+c3.getX()+c3.getY());
		System.out.println("centre of c4 = "+c4.getX()+c4.getY());
		
		//Get perimeter of the circles
		System.out.println("Perimeter of c1 = "+c1.getPerimeter());
		System.out.println("Perimeter of c2 = "+c2.getPerimeter());
		System.out.println("Perimeter of c3 = "+c3.getPerimeter());
		System.out.println("Perimeter of c4 = "+c4.getPerimeter());
		
		//Print distance between cirlces
		System.out.println("Distance between c1 and c2 = "+c1.getDistance(c2));
		System.out.println("Distance between c3 and c4 = "+c3.getDistance(c4));

		System.out.println("c1: " + c1.toString());
		System.out.println("c2: " + c2.toString());
		System.out.println("c3: " + c3.toString());
		System.out.println("c4: " + c4.toString());

		// Display the number of Circle objects created
		System.out.println("Number of Circle objects: " +
				Circle.getNumberOfObjects());
	}
}

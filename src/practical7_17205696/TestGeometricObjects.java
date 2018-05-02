package practical7_17205696;

public class TestGeometricObjects {
	public static void main(String[] args) {
		// Create some GeometricObject objects
		GeometricObject c = new Circle();
		GeometricObject r = new Rectangle(2.5, 0.5, "red", false);
		GeometricObject p1 = new RegularPolygon();
		GeometricObject p2 = new RegularPolygon(4, 1.5);
		GeometricObject p3 = new RegularPolygon(7, 2.5, "blue", true);
		
		display(c);
		display(r);
		display(p1);
		display(p2);
		display(p3);
	}
	
	// A method for displaying a GeometricObject object.
	public static void display(GeometricObject o) {
		System.out.println("color: " + o.getColor());
		System.out.println("isFilled? " + o.isFilled());

		if (o instanceof Circle) {
			System.out.println("The circle area is: " + ((Circle)o).getArea());
			System.out.println("The circle perimeter is: " + ((Circle)o).getPerimeter());
		} else if (o instanceof Rectangle) {
			System.out.println("The rectangle area is: " + ((Rectangle)o).getArea());
			System.out.println("The rectangle perimeter is: " + ((Rectangle)o).getPerimeter());
		} else if (o instanceof RegularPolygon) {
			System.out.println("The regular polygon area is: " + ((RegularPolygon)o).getArea());
			System.out.println("The regular polygon perimeter is: " + ((RegularPolygon)o).getPerimeter());
		}	
		System.out.println();
	}
}


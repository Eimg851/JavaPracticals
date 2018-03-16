package practical1_17205696;
//A program that reads in the radius and length of a cylinder and computes the area and volume

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for radius value
		System.out.println("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();
		
		//Prompt the user for length value
		System.out.println("Enter the length of the cylinder: ");
		double length = input.nextDouble();
		
		//Compute area
		double area = Math.PI*(Math.pow(radius,2));
		//Display result
		System.out.println("The area of the cylinder is: " + area);
		
		//Computer volume
		double volume = (area*length);
		//Display result
		System.out.println("The volume of the cylinder is: " + volume);
		
		//Closing scanner object
		input.close();
	}
}
package Practical2_17205696;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.println("Enter values for a, b and c(a must be a non-zero number):");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Compute discriminant
		double discriminant = (Math.pow(b, 2) - 4*a*c);
		//Compute squareRoot of discriminant
		double root = Math.sqrt(discriminant);
		double bottom = 2*a;
		
		//Check if a is non zero
		if (a == 0) {
			//Print error message
			System.out.println("a must be a non zero");
		}
		else if (discriminant > 0) {
			//Compute the two roots
			double r1 = (-b + root);
			double r2 = (-b - root);
			//Display results
			System.out.println("The first root of this equation is: "+(r1/bottom));
			System.out.println("The second root of this equation is: "+(r2/bottom));
		}
		else if(discriminant == 0) {
			//Compute the root
			double r1 = (-b + root);
			//Display result
			System.out.println("The root of this equation is: "+(r1/bottom));
			}
		else {
			//Display error message
			System.out.println("The equation has no real roots");
		}
		//Closing scanner object
		input.close();
	}
}

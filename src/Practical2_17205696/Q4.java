package Practical2_17205696;
/*A program that prompts the user to enter the length from the center of a pentagon to a
vertex and computes the area of the pentagon*/

import java.util.Scanner;


public class Q4 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter the length or the vertex: ");
		double vertex = input.nextDouble();
		
		//Check if input is valid
		if (vertex < 0) {
			//Print error message
			System.out.println("The vertex must be greater than one!");
		}
		else {
			//Compute area
			double angle = Math.PI/5;
			double side = 2*vertex*(Math.sin(angle));
			double tan = 4*Math.tan(angle);
			double top = 5*Math.pow(side, 2);
			double area = top/tan;
			//Display result
			System.out.println("The area of the pentagon is: "+area+" cm\u00B2");
		}
		
		//Close scanner object
		input.close();
	}
}

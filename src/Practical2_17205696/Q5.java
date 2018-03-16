package Practical2_17205696;
/*A program that prompts the user to enter a point (x, y) and checks whether the point is
inside or on the edge of the rectangle centered at (0, 0) with width 10 and height 5.*/

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter first the value for x, then the value for y");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//Check if point is inside the rectangle
		if (x > -5 && x < 5 && y > -2.5 && y < 2.5) {
			//Display result
			System.out.println("The point you have entered is inside the rectangle");
		}
		//Check if point is on the edge of the rectangle
		else if(x == -5 && (y >= -2.5 && y <= 2.5)) {
			//Display result
			System.out.println("The point you have entered is on the edge of the rectangle");
		}
		else if(x == 5 && (y >= -2.5 && y <= 2.5)) {
			//Display result
			System.out.println("The point you have entered is on the edge of the rectangle");
		}
		else if(y == -2.5 && (x >= -5 && x <=5)) {
			//Display result
			System.out.println("The point you have entered is on the edge of the rectangle");
		}
		else if(y == 2.5 && (x >= -5 && x <=5)) {
			//Display result
			System.out.println("The point you have entered is on the edge of the rectangle");
		}
		else {
			//Display result
			System.out.println("The point you have entered is outside the rectangle");
		}
		
		//Close scanner object
		input.close();
	}
}

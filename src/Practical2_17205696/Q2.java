package Practical2_17205696;
/*A program that reads the lengths of the three sides of a triangle and computes the perimeter if the input is valid. 
Otherwise, display that the input is invalid.*/

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for an integer
		System.out.println("Enter the length of the three sides:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		//Check if input entered is valid
		if ((side1+side2 > side3) || (side2+side3 > side1) || (side1+side3 > side2)){
			System.out.println("Input entered is valid.");
			//Compute the perimeter and assign it to a variable
			double perimeter = (side1 + side2 + side3);
			//Dislpay result
			System.out.println("The perimeter of the Trianlge is: "+perimeter);
		}
		else {
			//Display result
			System.out.println("Input entered is not valid.");
		}
		
		//Closing scanner object
		input.close();
	}
}

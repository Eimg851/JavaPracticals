package practical1_17205696;
// It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
//A program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
//Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for weight in pounds
		System.out.println("Enter weight in pounds:");
		double weight = input.nextInt();
		
		//Prompt the user for height in inches
		System.out.println("Enter height in inches:");
		double height = input.nextInt();
	
		//Convert to metric units
		double bmiWeight = weight * 0.45359237;
		double bmiHeight = height * 0.0254;
		
		//Compute BMI
		double bmi = bmiWeight/(Math.pow(bmiHeight,2));
		//Display result
		System.out.println("Your BMI is: "+bmi);
		
		//Closing scanner object
		input.close();
}
}

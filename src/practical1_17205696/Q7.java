package practical1_17205696;
//A program that prompts the user to enter a temperature between -58F and 41F and a wind
//speed greater than or equal to 2 and displays the wind-chill temperature. 

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for temperature
		System.out.println("Enter temperature in degrees Fahrenheit (Must be between -58F and 41F): ");
		double temp = input.nextDouble();
		
		//Prompt the user for windspeed
		System.out.println("Enter the windspeed in mph (Must be greater than or equal to 2mph): ");
		double windSpeed = input.nextDouble();
		double wind = Math.pow(windSpeed, 0.16);
		
		//Compute the wind chill temperature
		double form1 = 0.6215*temp;
		double form2 = 35.75*wind;
		double form3 = 0.4275*temp*wind;
		double twc = 35.74 + form1 - form2 + form3;
		
		//Display result
		System.out.println("The outside wind chill temperature is "+twc);
		
		//Closing scanner object
		input.close();
	}
}

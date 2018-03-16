package practical1_17205696;
//A program that reads the subtotal and the gratuity rate, then computes the gratuity and total.

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for subtotal value
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		
		//Prompt the user for subtotal value
		System.out.println("Enter the gratuity rate: ");
		double gratuityRate = input.nextDouble();
		
		//Compute gratutiy
		double gratuity = (subtotal * (gratuityRate/100));
		
		//Compute total price
		double total = gratuity + subtotal;
		
		//Display result
		System.out.println("Gratuity is: $" + gratuity);
		System.out.println("Total is: $" + total);
		
		//Closing scanner object
		input.close();
	}
}

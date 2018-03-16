package Practical2_17205696;
//A program that prompts the user to enter an integer between 0 and 15, inclusive and checks if the input is valid.
//If so, display its corresponding hex number.

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for an integer
		System.out.println("Enter an integer between 0 and 15 (inclusive):");
		int numberToHex = input.nextInt();
		
		//Check if the number entered is within the specified range
		if (numberToHex >= 0 && numberToHex <= 15){
			//Declare the string of Hexadecimal numbers
			String hexNum = "0123456789ABCDEF";
			//Access the corresponding Hexadecimal number
			char hex = hexNum.charAt(numberToHex);
			//Display result
			System.out.println("Number entered is valid. Corresponding hex number is: "+hex );
			}
		else {
			//Display result
			System.out.println("Number entered is not valid.");
		}
		
		//Closing scanner object
		input.close();
	}
}

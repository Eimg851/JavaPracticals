package Practical2_17205696;
/*A program that 
 * reads a Unicode value, checks that the user inputs a valid code and displays its character
 * reads a character and displays its Unicode value (in decimal).*/

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter a number between 0 and 65,535 inclusive: ");
		double unicode = input.nextDouble();
		
		//Check if input is valid
		if (unicode >=0 && unicode <=65535) {
			char character = (char)unicode;
			System.out.println("The character equivalent is: "+character);
			int i = (int)character;
			System.out.println("The unicode value in decimal for "+character+" is: "+i);
		}
		
		//Close scanner object
		input.close();
	}
}

package practical1_17205696;
//A program that reads an integer between 0 and 999 (inclusive) and adds all the digits in the integer.

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for an integer
		System.out.println("Enter a number between 0 and 999:");
		int integer = input.nextInt();
		
		//Find the first digit
		int digit1 = integer % 10;
		
		//Extract the last digit
		int second = integer/10;
		
		//Find the second digit
		int digit2 = second % 10;
		
		//Find the third digit
		int digit3 = second/10;
		
		//Compute the sum of the three numbers
		int sum = digit1 + digit2 + digit3;
		
		//Display result
		System.out.println("The sum of "+integer+" is: "+sum);
		
		//Closing scanner object
		input.close();
	}
}

package practical3_17205696;

import java.util.Scanner;

/*Using a do-while loop, write a program that reads a sequence of positive integers from the console,
finds the largest of them, and counts the number of times this largest integer occurs.*/

public class Q5 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
			
		
		//Initialise variables
		int max = 0; // largest integer
		int count = 1;//amount of times number is recognised
		boolean exitloop = false;

		do {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer (0 ends the input): ");
			int number = input.nextInt();
			
			if (number != 0) {
				// If number > max, set max to number and count to 1
				if (number > max) { 
					max = number;
					count = 1;
				}
				else if (number == max){
					count ++;
					}
				}
			else {
				exitloop = true;
			}
			} while (!exitloop);
		
		
		// Display result
		if (max > 0) {
			System.out.println("The max number is: " + max);
			System.out.println("The count for the max number is: " + count);
		}
		else 
			System.out.println("No numbers are entered except 0");
		
		input.close();
	}
}

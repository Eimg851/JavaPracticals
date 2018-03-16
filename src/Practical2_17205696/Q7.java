package Practical2_17205696;
/*A program that prompts the user to enter a lowercase letter. Checks if the
input is valid and if so, checks whether the letter is a vowel or consonant.*/

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter a lowercase letter: ");
		char lowercase = input.next().charAt(0);
		
		//Check if input is lowercase
		if (Character.isLowerCase(lowercase)){
			System.out.println("The input is valid");
			//Check if input is a vowel
			if (lowercase=='a' || lowercase=='e' || lowercase=='i' || lowercase=='o' || lowercase=='u') {
				System.out.println("You have entered a vowel");	
			}
			else {
				System.out.println("You have entered a consonant");
			}
		}
		else {
			System.out.println("The input is not valid");
		}
		
		//Close scanner object
		input.close();
	}
}

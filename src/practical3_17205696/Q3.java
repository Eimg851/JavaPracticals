package practical3_17205696;
/*A program that prompts the user to enter two strings and displays the largest common
prefix of the two strings. */

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter two lines of text: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		
		//Initialise empty string
		String commonPrefix = "";
		
		//Find length for loop
		int loopLen = 0;
		if (s1.length() > s2.length()) {
			loopLen = s2.length();
		}
		else {
			loopLen = s1.length();
		}
		
		//Find common prefix
		for (int i = 0; i < loopLen; i++) {
			char ch = s1.charAt(i);
			if (ch != s2.charAt(i)) {
				break;
			}
			else 
				commonPrefix += ch;
		}
		
		//Display result
		int anyCommons = commonPrefix.length();
		if (anyCommons > 0) {
			System.out.println("The common prefix for these two strings is: "+commonPrefix);
		}
		else {
			System.out.println("No common prefix");
		}
		
		//Close scanner object
		input.close();
		}
	}

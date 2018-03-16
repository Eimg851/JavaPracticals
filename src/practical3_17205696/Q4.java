package practical3_17205696;
/*A program that prompts the user to enter a string and displays the string in reverse order.
Sample run: given input text “Hello World!”, the output should be “!dlroW olleH”.*/

import java.util.Scanner;

public class Q4 {
	public static void main (String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
				
		//Prompt user for input
		System.out.print("Enter a line of text: ");
		String s1 = input.nextLine();
		
		//Find length of loop
		int len = s1.length();
		
		//Initialise empty string
		String s2 = "";
		
		for (int i=len;i > 0; i--) {
			 s2 += s1.charAt(i-1);
		}
		System.out.println(s2);
		
		//Close scanner object
		input.close();
	}

}

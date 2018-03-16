package practical3_17205696;
/*A program to create a simple cypher. The program should read a string from the console
and replace every lowercase letter in the string with the next lowercase letter in the alphabet. For
example, ‘a’ should be replaced with ‘b’, ‘b’ with ‘c’, etc. and the letter ‘z’ should be replaced
with ‘a’. Display the cypher to the console.*/

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("Enter a line of text: ");
		String s1 = input.nextLine();
		
		// Iterate over the characters in the string
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) { 
			char ch = s1.charAt(i);
			
			//Replace lowercase letters with next lowercase letter in sequence
			if (ch=='z') {
				char j = 'z' - 25;
				s2 += (j);
				}
			else if (Character.isLowerCase(ch))
				s2 += (++ch);
			else
				s2 += (ch);
		}
		
		//Display cypher
		System.out.println(s2);
		
		//Close scanner object
		input.close();
	}
}

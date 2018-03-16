package practical3_17205696;
/*A program to read a string from the console. Ignoring case, display the number of vowels
and consonants in the text.*/

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args){
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.println("Enter a line of text: ");
		String s1 = input.nextLine();
		
		//Initialise vowel and consonant counters
		int vowels = 0;
		int consonants = 0;
		
		//Initialise empty string
		String s2 = "";
		//Convert all letters to lowercase and get rid of non-letter characters
		for (int i = 0; i < s1.length(); i++) { 
			char ch = s1.charAt(i);
			
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch))
				s2 += Character.toLowerCase(ch);
			else
				continue;
		}
		
		//Count the number of vowels and consonants
		for (int i = 0; i < s2.length(); i++) { 
			char ch = s2.charAt(i);
				switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': vowels ++; break;
				default: consonants ++;
				}
			}
		
		//Display result
		System.out.println("The string you entered has: "+vowels+" vowels and "+consonants+" consontants");
	
		//Close scanner object
		input.close();
	}
}

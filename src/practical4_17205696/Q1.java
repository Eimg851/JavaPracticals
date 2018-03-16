package practical4_17205696;
/*A program that checks whether a string is a valid password. A password is valid if and only if
 * it has eight characters, 
 * contain only uppercase and lowerscase letters and digits 
 * contains at least two digits and one lowercase letter.
*/

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for passport
		System.out.println("Enter password: ");
		String password = input.nextLine().trim();
		
		//Display results
		System.out.println(password + (isValidPassword(password) ? " is valid" : "is invalid"));
		
		//Close scanner object
		input.close();
	}

	//// Return true if the password is valid; false otherwise
	public static boolean isValidPassword(String password) {
		if(hasValidLength(password) && containsLettersDigits(password) && satisfiesCountCheck(password)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// Return true if the password has at least eight characters; false otherwise
	public static boolean hasValidLength(String password) {
		if (password.length() >= 8) {
			return true;
			}
		else {
			return false;
		}
	}
	// Return true if the password contains only lowercase letters, uppercase
	// letters, and digits; false otherwise
	public static boolean containsLettersDigits(String password) {
		boolean t = true;
		for (int j = 0; j < password.length(); j++) {
			char validch = password.charAt(j);
			if (Character.isDigit(validch) || Character.isLowerCase(validch) || Character.isUpperCase(validch)){
				t = true;
			}
			else t = false;
		}
		return t;
	}
	
	// Return true if the password contains at least two digits and at least one
	// lowercase letter
	public static boolean satisfiesCountCheck(String password) {
		int number_count = 0;
		int lowercase_count = 0;
		for (int i = 0; i < password.length(); i++) { 
			char ch = password.charAt(i);
			
			if (Character.isDigit(ch)) {
				number_count +=1;
			}
			else if(Character.isLowerCase(ch)) {
				lowercase_count+=1;
				}
			}
		if(number_count >= 2 && lowercase_count >= 1) {
			return true;
		}
		else {
			return false;
		}
	}
}

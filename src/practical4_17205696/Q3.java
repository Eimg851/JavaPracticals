package practical4_17205696;

/*Write a program to read an integer from the console and check whether it is a palindrome.*/

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.println("Enter the number you wish to check: ");
		int num = input.nextInt();
		
		//Check if number is a palindrome
		if(isPalindrome(num)) {
			System.out.println(num+" is a palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
		
		//Close scanner object
		input.close();
	}

	public static boolean isPalindrome(int number) {
		int reversal = (reverse(number));
		boolean result = true;
		if (reversal != number) {
			result = false;
		}
		return result;
	}
	
	public static int reverse(int number) {
		String str1 = Integer.toString(number);
		if (str1.length()==1) {
			return number;
			
		}
		else {
			String newnum = "";
			for(int i=str1.length();i>0;i--) {
				newnum += str1.charAt(i-1);
			}
			int result = Integer.parseInt(newnum);
			return result;
		}
	}
}

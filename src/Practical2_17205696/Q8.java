package Practical2_17205696;
/*A program that prompts the user to enter a year and the three letters of a month name 
 * and displays the number of days in the month. If the month entered is Feb, the program should check if the year entered is a leap year
and output 28 or 29 days as appropriate. Rewrite the program using an if-else statement.*/

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month (e.g. Jan, Feb, etc.): ");
		String month = input.next();
		
		switch(month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec": System.out.println(month+" "+year+" has 31 days."); break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":System.out.println(month+" "+year+" has 30 days");break;
		case "Feb":
			int leapyear = 28;
			if ((year%4==0 && year%100 != 0)||(year%400==0)) {
				leapyear++;
			}
			System.out.println(month+" "+year+" has "+leapyear+" days");
		default:
			System.out.println("The input you have entered is invalid");
		}
		
		//Close scanner object
		input.close();
	}
}

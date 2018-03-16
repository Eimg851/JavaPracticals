package practical1_17205696;
//A program to prompt the user to enter a number of years and displays the population after this number of years. 
//Assume the current population is 312,032,486 and one year has 365 days.

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a number of years
		System.out.println("Enter a number of year(s):");
		int years = input.nextInt();
		
		int currentPop = 312032486;
		int secondsPerYear = 365*24*60*60;
		System.out.println(secondsPerYear);
		
		//Compte births per year
		int birth = secondsPerYear/7;
		System.out.println("Number of births: "+birth);
		
		//Compute births per year
		int death = secondsPerYear/13;
		System.out.println("Number of deaths: "+death);
			
		//Compute births per year
		int immigrant = secondsPerYear/45;
		System.out.println("Number of immigrants: "+immigrant);
		
		//Compute population
		int population = currentPop+birth+immigrant-death;
		System.out.println("Population after "+years+" year is "+population);
		
		
		/* ** Must remember to multiply by the year entered at the end */
		//Closing scanner object
		input.close();
	}						
}

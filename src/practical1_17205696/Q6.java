package practical1_17205696;
//A program that prompts the user to enter two points (x1; y1) and (x2; y2) and displays their
//distance between them.

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for x1
		System.out.println("Enter x1:");
		int x1 = input.nextInt();
				
		//Prompt the user for y1
		System.out.println("Enter y1:");
		int y1 = input.nextInt();
		
		//Prompt the user for x2
		System.out.println("Enter x2:");
		int x2 = input.nextInt();
		
		//Prompt the user for y2
		System.out.println("Enter y2:");
		int y2 = input.nextInt();
		
		//Computer distance
		int distanceX = x2 - x1;
		int distanceY = y2 - y1;
		double distance = Math.sqrt((Math.pow(distanceX,2))+(Math.pow(distanceY,2)));
	
		//Display result
		System.out.println("The distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is: "+distance);
		
		//Closing scanner object
		input.close();
	}
}

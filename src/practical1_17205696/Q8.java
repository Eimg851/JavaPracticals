package practical1_17205696;
//A program that prompts the user to enter the distance to drive, the fuel efficiency of the
//car in miles per gallon, and the price per gallon, and displays the cost of the trip.
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for distance to drive
		System.out.println("Enter the distance to drive: ");
		double distance = input.nextDouble();
		
		//Prompt the user for fuel efficiency
		System.out.println("Enter the fuel efficiency in miles per gallon: ");
		double fuelEfficiency = input.nextDouble();
		
		//Prompt the user for fuel price
		System.out.println("Enter the price of fuel per gallon: ");
		double fuelPrice= input.nextDouble();
		
		//Compute the cost of the trip
		double milesToTravel = distance/fuelEfficiency;
		double cost = milesToTravel*fuelPrice;
		
		//Display result
		System.out.println("To travel "+distance+" miles, will cost you €"+cost);
		
		//Closing scanner object
		input.close();
	}
}


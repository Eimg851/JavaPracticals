package practical5_17205696;
/*Write the following method that returns true if an array of integers is sorted in ascending order:*/

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the number of integers they are going to enter
		System.out.println("How many integers are in the array? ");
		int n = input.nextInt();
		
		//Check that the size of the array is valid
		if (n < 0) {
			System.out.println("Array cannot contain negative amount of numbers. Please try again.");
		}
		else {
		// Declare and create an array 
		int [] myArray = new int[n];
		
		//Check is array size is greater than one, then allow input
		if (n > 0) {
		// Prompt the user to enter the numbers; read the numbers into the array
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextInt();
		}
	}
		
		//Invoke method to check if array is sorted
		if (isSorted(myArray)) {
			System.out.println("This array is sorted");
		}
		else {
			System.out.println("This array is not sorted");
		}
	}
		//Close scanner object
		input.close();
	}
	public static boolean isSorted(int[] arr) {
		boolean sorted = true;
		for (int i = 0; i < arr.length-1 ; i++) 
			if (arr[i] > arr[i+1])
				sorted = false;
		return sorted;
	}
}

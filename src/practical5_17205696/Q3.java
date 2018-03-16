package practical5_17205696;
/*A program to test whether an array contains (at least one instance of) four
consecutive integers with the same value.

Test cases:
 The following arrays do not contain four consecutive integers with the same value:
[] (i.e. an array with zero elements)
[1, 1, 1]
 The following arrays do contain four consecutive integers with the same value:
[6, 1, 3, 29, 29, 29, 29, 1000]*/
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the number of integers they are going to enter
		System.out.println("How many integers are in the array? ");
		int n = input.nextInt();
				
		//Check that the size of the array is valid
		if (n <= 3) {
			System.out.println("Array needs at least 4 elements to check for four consecutive numbers");
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
		
		//Display result
		if(isConsecutiveFour(myArray)) {
			System.out.println("The array entered contains four or more consecutive integers");
		}
		else {
			System.out.println("The array entered does not contain four consecutive integers");
		}
			}
	}
		//Close scanner object
		input.close();
	}
	
	public static boolean isConsecutiveFour(int[] values) {
		boolean contains4 = false;
		int count = 0;
		for (int i = 0; i < values.length-1 ; i++) 
			if (values[i] == values[i+1]){
				count += 1;
				}
		if (count == 3 || count > 3) {
			contains4 = true;
		}
		return contains4;
	}
}

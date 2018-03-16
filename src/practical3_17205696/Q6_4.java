package practical3_17205696;
/*Write separate classes to display each of the following patterns. Each program should read a
integer, n, from the console, which gives the number of rows and columns in the pattern. (Hint: Use
nested for loops to display each pattern. This is a challenging question!)*/

import java.util.Scanner;

public class Q6_4 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter an integer value for n: ");
		int n = input.nextInt();
		
		if (n>0) {
			for (int i=n;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		
		//Close scanner object
		input.close();
	}

}

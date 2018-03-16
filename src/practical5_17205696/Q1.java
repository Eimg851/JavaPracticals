package practical5_17205696;
/*A method that returns the Largest Common Suffix (LCS) of two strings.*/
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
	//Create a scanner object
	Scanner input = new Scanner(System.in);
	
	//Prompt the user for two strings
	System.out.println("Enter the two sentences for which you wish to compare the Largest Common Suffix: ");
	String s1 = input.nextLine();
	String s2 = input.nextLine();
	
	//Invoke method to check for Largest Common Suffix
	String s3 = getLCS(s1, s2);
	
	//Display result
	if (s3.length() > 0) {
		System.out.println("The largest common suffix for the two strings entered is: "+s3);
	}
	else {
		System.out.println("The string returned empty. There is no common suffix for the two strings entered.");
	}
		//Close scanner object
		input.close();
	}
public static String getLCS(String s1, String s2) {
	String newString = "";
	String reverseS1 = "";
	String reverseS2 = "";
	String suffix = "";
	
	for (int i = s1.length() - 1; i >= 0; i--) 
		reverseS1 += s1.charAt(i);
	
	for (int i = s2.length() - 1; i >= 0; i--) 
		reverseS2 += s2.charAt(i);
	
	int i = 0;
	while (i < reverseS1.length() && i < reverseS2.length() && reverseS1.charAt(i) == reverseS2.charAt(i))
		newString += reverseS1.charAt(i++);
	
	for (int j = newString.length() - 1; j >= 0; j--) 
		suffix += newString.charAt(j);
	return suffix;
}
}
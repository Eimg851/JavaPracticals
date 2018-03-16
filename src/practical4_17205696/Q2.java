package practical4_17205696;
/*A method to determine whether a number is a perfect number
(use the method header given below)*/

public class Q2 {
	public static void main(String[] args) {
		//Initialise value for i and count
		//Starting at 0
		int i= 0;
		int count = 0;
		
		//Display result
		System.out.print("The first four perfect numbers are");
		//Finding first 4 perfect numbers
		while (count < 4) {
			 if (isPerfectNumber(i)) {
				 System.out.print(", "+i);
					i++;
					count++;
			 	}
			 else {
				 i++;
			 	}
			}
		}

	public static boolean isPerfectNumber(int number) {
		//Initialise sum of Divisors
		int sumDivisors = 0;
		//Initialise boolean result to false
		boolean result = false;
		
		//Check if number is 0
		if (number == 0) {
			return result;
		}
		else {
			//Find the divisors of the number
			for(int j=1; j < number; j++) {
				if (number % j == 0){
					//Sum the divisors
					sumDivisors +=j;
				}
			}
			//Check if perfect number
			if (sumDivisors == number){
				result = true;
				}
			}
		return result;
		}
	}


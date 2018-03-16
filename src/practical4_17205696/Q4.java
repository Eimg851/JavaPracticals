package practical4_17205696;

/*Write a method to test whether a number is prime (use the method header given below). To test
whether a number is prime, check if it is divisible by 2, 3, 4, and so on up to and including number/2;
if a divisor is found, the number is not prime (note that any number 1 is not prime).*/

public class Q4 {
	public static void main(String[] args) {
			int i= 0;
			int count = 0;
			//Display result
			System.out.print("The first 10 prime numbers are");
			while (count < 10 ) {
				 if (isPrime(i)) {
					 System.out.print(", "+i);
						i++;
						count++;
				 	}
				 else {
					 i++;
					 }
				}
			}
			
		public static boolean isPrime(int number) {
			boolean result = false;
			if (number <= 1) {
				result = false;
			}
			else {
				int sumDivisors = 0;
				for(int i=1; i < number; i++) {
					System.out.println(sumDivisors);
					System.out.println(number);
					if (number % i == 0){
						sumDivisors += i;
						}
					}
				
				if (sumDivisors == number+1)
					result = true;
				}
			return result;
			}
		}

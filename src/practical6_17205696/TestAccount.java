package practical6_17205696;

public class TestAccount {
	public static void main(String[] args) {
		Account acc1 = new Account(10, 120);
		Account acc2 = new Account(5, 6000);
		acc2.setBalance(3000);
		acc2.setID(6);
		acc2.setAnnualInterestRate(0.5);
		System.out.println("Showing info for acc2");
		System.out.println("Balance = "+acc2.getBalance());
		System.out.println("Annual interest rate = "+acc2.getAnnualInterestRate());
		System.out.println("New ID = "+acc2.getID());
		System.out.println("Created = "+acc2.getDateCreated());
		
		System.out.println("\n");
		System.out.println(acc1.toString());
		System.out.println("Annual interest rate = "+acc1.getAnnualInterestRate());
		System.out.println("Monthly Interest = "+acc1.getMonthlyInterest());
		System.out.println("Balance before withdrawl = "+acc1.getBalance());
		acc1.withdraw(40.00);
		System.out.println("Balance after withdrawl = "+acc1.getBalance());
		acc1.deposit(50);
		System.out.println("Balance after deposit = "+acc1.getBalance());
		acc1.setID(15);
		System.out.println("New ID = "+acc1.getID());
		acc1.withdraw(3000);
		System.out.println("Account Balance = "+acc1.getBalance());
		acc1.setAnnualInterestRate(4);
		System.out.println("Annual interest rate = "+acc1.getAnnualInterestRate());
	}

}

package practical7_17205696;
import java.util.Date;

public class CheckingAccount extends Account{
	double overdraftLimit = 1000; // The default overdraftLimit

	public CheckingAccount(int id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	
	// Return the annual interest rate
		public double getOverdraftLimit() {
			return overdraftLimit;
		}
		
	// Set a new annual interest rate
	public void setOverdraftLimit(double NewOverdraftLimit) {
		overdraftLimit = NewOverdraftLimit;
		}
		
		// Withdraw the amount specified
		@Override
		public void withdraw(double amount) {
			double currentBalance = this.getBalance();
			double limit = this.getOverdraftLimit();
			double newBalance = (currentBalance+limit)-amount;
			if(newBalance >= 0) {
				setBalance(currentBalance-amount);
				}
			else {
				System.out.println("Your current balance is $"+currentBalance+".Your overdraft limit is $"+limit+".\n You have attempted to withdraw $"+amount+".\n" + 
						"This transaction cannot be completed. Your balance is unchanged.");
			}
		}
		
		// Return the monthly interest amount
		@Override
		public double getMonthlyInterest() {
			double bal = this.getBalance();
			double interestRate = getAnnualInterestRate();
			if (bal <= 0) {
				return 0;
			}
			else {
				return bal * interestRate / 12;
			}
		}
		
		// Return a String representation 
		@Override
		public String toString() {
			int ID = this.getId();
			double bal = this.getBalance();
			Date Registered = this.getDateCreated();
			double credit = this.getOverdraftLimit();
			double interest = this.getMonthlyInterest();
			return "id = " + ID + ", balance = " + bal + ", date created = " + Registered+", overdraft limit = "+credit+", monthly interest = "+interest;
		}
		

	
}

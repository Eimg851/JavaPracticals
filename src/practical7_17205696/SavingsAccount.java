package practical7_17205696;

public class SavingsAccount extends Account{

	public SavingsAccount(int id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	
	// Withdraw the amount specified
	@Override
	public void withdraw(double amount) {
		double currentBalance = this.getBalance();
		double newBalance = currentBalance-amount;
		if(newBalance >= 0) {
			setBalance(newBalance);
			}
		else {
			System.out.println("Your current balance is $"+currentBalance+". You have attempted to withdraw $"+amount+".\n" + 
					"This transaction cannot be completed. Your balance is unchanged.");
		}
	}
}

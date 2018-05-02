package practical6_17205696;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate = 0.045;
	private Date dateCreated = new Date();
	
	//Creates a new account
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// Returns the id of this account
	public int getID() {
		return id;
	}
	
	// Returns the balance of this account
	public double getBalance() {
		return balance;
	}
	
	// Returns the annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//Sets a new id for this account
	public void setID(int id) {
		this.id = id;
	}
	
	//Sets a new balance for this account
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Sets a new Annual Interest Rate for all accounts
	public void setAnnualInterestRate(double annualInterest) {
		if (annualInterest >= 0 && annualInterest <=1) {
			annualInterestRate = annualInterest;
			}
		else {
			System.out.println("Set Annual Interest Rate request rejected. Annual Interest Rate must be 0 to 1 inclusive.");
		}
	}
	
	// Returns the date this account was created
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Returns the MonthlyInterest of this account
	public double getMonthlyInterest() {
		return (balance * annualInterestRate) / 12;
	}
	
	//Method to withdraw specified amount from an account
	public void withdraw(double amount) {
		double newBalance = this.balance-amount;
		if(newBalance >= 0) {
			setBalance(newBalance);
			}
		else {
			System.out.println("Withdrawl request rejected due to insufficient funds.");
		}
	}
	
	//Method to deposit specified amount to an account
	public void deposit(double amount) {
		double newBalance = this.balance+amount;
		setBalance(newBalance);
	}
	
	//Returns a string representation of this account
	public String toString() {
		return "Account ID = " + id + "\nBalance = "+ balance + "\nDate Created = " + dateCreated; 
		
	}
	
}

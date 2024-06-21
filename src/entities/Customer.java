package entities;

public class Customer {
	
	private int accNumber;
	private String agencyNumber;
	private String holderName;
	private double balance;

	
	public Customer() {
	}

	public Customer(int accNumber, String agencyNumber, String holderName) {
		this.accNumber = accNumber;
		this.agencyNumber = agencyNumber;
		this.holderName = holderName;
	}

	public Customer(int accNumber, String agencyNumber, String holderName, double initialDeposit) {
		this.accNumber = accNumber;
		this.agencyNumber = agencyNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}

	public int getAccount() {
		return accNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		double tax = 5.0;
		balance -= withdraw + tax;
	}
	
	public String toString() {
		return "Account " + accNumber 
		+ ", Agency: " + agencyNumber
		+ ", Holder: " + holderName
		+ ", Balance: $ " + String.format("%.2f", balance);
	}

}

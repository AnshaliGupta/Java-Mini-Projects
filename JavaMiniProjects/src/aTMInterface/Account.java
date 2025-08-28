package aTMInterface;

public class Account {
	private String accName = "Anshali";
	private String password = "ansh1234";
	private int balance = 12000;
	
	public boolean passwordValidator(String password) {
		return this.password.equals(password);
	}
	
	public void showBalance() {
		System.out.println("Balance in the account: "+balance);
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("Not enough balance.");
			return;
		}
		balance = balance - amount;
		System.out.println("Withdrawn "+amount+" Successfully");
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposited "+amount+" into your account");
	}
}

package simpleBankingSystem;
public class BankAccount {
	
	int accountNum;
	String name;
	long phoneNum;
	String address;
	int balance;
	
	public void createAccount(String name, long phoneNum, String address) {
		this.accountNum = 100000 + (int)(Math.random() * 900000);
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.balance = 0;
		System.out.println("Account created Successfully.");
	}
	
	public void deposit(int amount) {
		if(amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		balance += amount;
		System.out.println("Deposited Rs."+amount+" successfully.");
	}
	
	public void withdraw(int amount) {
		if(amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		if(balance < amount) {
			System.out.println("Not Enough Balance.");
			return;
		}
		balance = balance - amount;
		System.out.println("Successfully withdrew Rs."+amount+" from your account.");
	}
	
	public void displayDetails() {
		System.out.println("\n------Account Details-------");
		System.out.println("Account Number: "+accountNum);
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phoneNum);
		System.out.println("Address: "+address);
		System.out.println("Balance: "+balance+"\n");
	}
}

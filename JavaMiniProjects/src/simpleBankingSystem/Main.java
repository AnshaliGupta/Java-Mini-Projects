package simpleBankingSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	//helper function to find account through account number
	static BankAccount findAccount(ArrayList<BankAccount> accounts, long accNum) {
		for(BankAccount b : accounts) {
			if(b.accountNum == accNum) {
				return b;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> accounts = new ArrayList<>();
		System.out.println("------Simple Banking System-----");
		int choice;
		
		do {
			System.out.println("\n1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. View Details/Balance");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				BankAccount b1 = new BankAccount();
				System.out.println("Enter Details:-");
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Phone no.: ");
				long phoneNum = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter Address: ");
				String address = sc.nextLine();
				b1.createAccount(name, phoneNum, address);
				System.out.println("Your account number is: "+b1.accountNum);
				accounts.add(b1);
				break;
			
			case 2:
				System.out.println("Enter your account number: ");
				int accNum2 = sc.nextInt();
				BankAccount b2 = findAccount(accounts, accNum2);
				if(b2 != null) {
						System.out.println("Enter Money you want to deposit: ");
						int amount = sc.nextInt();
						b2.deposit(amount);
					} else {
						System.out.println("Account not found.");
					}
				break;
			
			case 3:
				System.out.println("Enter your account number: ");
				int accNum3 = sc.nextInt();
				BankAccount b3 = findAccount(accounts, accNum3);
				if(b3 != null) {
						System.out.println("Enter Money you want to withdraw: ");
						int amount = sc.nextInt();
						b3.withdraw(amount);
					} else {
						System.out.println("Account not found.");
					}
				break;
			
			case 4:
				System.out.println("Enter your account number: ");
				int accNum4 = sc.nextInt();
				BankAccount b4 = findAccount(accounts, accNum4);
				if(b4 != null) {
						System.out.println("Your account Details & balance is: ");
						b4.displayDetails();
					} else {
						System.out.println("Account not found.");
					}
				break;
			
			case 5:
				System.out.println("Exiting Banking System. ThankYou!");
				break;
			
			default: 
				System.out.println("Invalid Choice.");
			}
		} while(choice != 5);
		
		sc.close();
	}
}

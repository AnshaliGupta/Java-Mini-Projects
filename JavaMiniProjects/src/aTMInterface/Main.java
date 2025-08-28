package aTMInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		
		System.out.println("--------------ATM System-------------");
		int i=0;
		while(i<3) {
			System.out.println("Enter the pin: ");
			String password = sc.next();
			if(ac.passwordValidator(password)) {
				break;
			} else {
				i++;
			}
		}

		if(i >= 3) {
			System.out.println("Account can't be opened.");
		} else {
			System.out.println("Account opened successfully.");
			int choice;
			
			do {
				System.out.println("/n1. Show balance");
				System.out.println("2. Withdraw money");
				System.out.println("3. Deposit money");
				System.out.println("4. Exit from System");
				System.out.println("Enter choice: ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					ac.showBalance();
					break;
				case 2:
					System.out.println("Enter amount to withdraw: ");
					int amount = sc.nextInt();
					ac.withdraw(amount);
					break;
				case 3:
					System.out.println("Enter amount to deposit: ");
					int deposit = sc.nextInt();
					ac.deposit(deposit);
					break;
				case 4:
					System.out.println("--------Exiting System---------");
					break;
				default:
					System.out.println("Invalid Choice.");
				}
			} while(choice != 4);
		}
		
		sc.close();
	}
}

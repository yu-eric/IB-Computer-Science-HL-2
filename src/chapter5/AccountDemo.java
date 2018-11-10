package chapter5;

import java.util.Scanner;

/**
 * This program simulates a bank with checking and savings accounts.
 */
public class AccountDemo {
	public static void main(String[] args) {
		BankAccount savingsAccount = new BankAccount();
		BankAccount checkingAccount = new BankAccount();
		Scanner in = new Scanner(System.in);
		System.out.println("What is the initial balance of your savings account?");
		while (!in.hasNextDouble()) {
			System.out.println("Please enter a positive balance.");
		}
		savingsAccount.setBalance(in.nextDouble());

		System.out.println("What is the initial balance of your checking account?");
		while (!in.hasNextDouble()) {
			System.out.println("Please enter a positive balance.");
		}
		checkingAccount.setBalance(in.nextDouble());


		while (!in.nextLine().equalsIgnoreCase("e")) {
			System.out.println("Do you want to withdraw (w), deposit (d), transfer (t), or exit (e)? ");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("w")) {
				System.out.println("Do you want to withdraw from your checking (c) or savings (s) account? ");
				String input2 = in.nextLine();
				if (input2.equalsIgnoreCase("c")) {
					System.out.println("How much do you want to withdraw?");
					checkingAccount.withdraw(in.nextDouble());
				} else if (input2.equalsIgnoreCase("s")) {
					System.out.println("How much do you want to withdraw?");
					savingsAccount.withdraw(in.nextDouble());
				}
			} else if (input.equalsIgnoreCase("d")) {
				System.out.println("Do you want to deposit into your checking (c) or savings (s) account? ");
				String input2 = in.nextLine();
				if (input2.equalsIgnoreCase("c")) {
					System.out.println("How much do you want to deposit?");
					checkingAccount.deposit(in.nextDouble());
				} else if (input2.equalsIgnoreCase("s")) {
					System.out.println("How much do you want to deposit?");
					savingsAccount.withdraw(in.nextDouble());
				}
			} else if (input.equalsIgnoreCase("t")) {
				System.out.println("Do you want to transfer from your checking (c) to savings account, or savings (s) to checking account? ");
				String input2 = in.nextLine();
				if (input2.equalsIgnoreCase("c")) {
					System.out.println("How much do you want to transfer to your savings account? ");
					double amtToTransfer = in.nextDouble();
					if (checkingAccount.getBalance() < 0 || checkingAccount.getBalance() - amtToTransfer < 0) {
						System.out.println("Sorry, you have overdrawn the account. Please try again.");
					} else {
						savingsAccount.withdraw(amtToTransfer);
						checkingAccount.deposit(amtToTransfer);
					}
				} else if (input2.equalsIgnoreCase("s")) {
					System.out.println("How much do you want to transfer to your checing account?");
					double amtToTransfer = in.nextDouble();
					if (savingsAccount.getBalance() < 0 || savingsAccount.getBalance() - amtToTransfer < 0) {
						System.out.println("Sorry, you have overdrawn the account. Please try again.");
					} else {
						savingsAccount.deposit(amtToTransfer);
						checkingAccount.withdraw(amtToTransfer);
					}
				}
			}
		}
		System.out.printf("The balance on your checking account is %.2f, and the balance on your savings account" +
				"is %.2f. Have a nice day!", checkingAccount.getBalance(), savingsAccount.getBalance());
	}
}

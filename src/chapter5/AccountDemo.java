package chapter5;

import java.util.Scanner;

/**
   This program simulates a bank with checking and savings accounts.
*/
public class AccountDemo
{
   public static void main(String[] args) {
		BankAccount savingsAccount = new BankAccount();
		BankAccount checkingAccount = new BankAccount();
		Scanner in = new Scanner(System.in);
		System.out.println("What is the initial balance of your savings account?");
		while(!in.hasNextDouble()) {
		  System.out.println("Please enter a positive balance.");
		}
		savingsAccount.setBalance(in.nextDouble());

		System.out.println("What is the initial balance of your checking account?");
		while(!in.hasNextDouble()) {
		  System.out.println("Please enter a positive balance.");
		}
		checkingAccount.setBalance(in.nextDouble());


   }

}

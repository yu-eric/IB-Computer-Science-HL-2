package chapter11;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ExceptionalBankAccount {

	private double balance = 0;

	/**
	 * Sets the initial balance of the account
	 * @param inBalance the initial balance
	 */
	public ExceptionalBankAccount(double inBalance) {
		if(balance < 0) {
			throw new IllegalArgumentException("You cannot construct an account with a negative balance!");
		} else {
			balance = inBalance;
		}
	}

	/**
	 * Adds money to the account
	 * @param amount money to be added
	 */
	public void deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative balance!");
		}
		balance += amount;
	}

	/**
	 * Withdraws money from the account
	 * @param amount money to be withdrawn
	 */
	public void withdraw(double amount) {
		if(amount < 0 || amount > getBalance()) {
			throw new IllegalArgumentException("Cannot withdraw this amount!");
		}
		balance -= amount;
	}

	/**
	 * Gets the balance of the account
	 * @return balance of the account
	 */
	public double getBalance() {
		return balance;
	}

}

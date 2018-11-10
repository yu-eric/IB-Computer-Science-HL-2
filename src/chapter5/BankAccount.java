package chapter5;

/**
 * This class creates a bank account
 */
public class BankAccount {
	private double balance;

	/**
	 * Constructs a bank account with zero balance.
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Makes a deposit into this account.
	 *
	 * @param amount the amount of the deposit
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * Withdraws money from the savings account
	 *
	 * @param amount the amount of the withdrawal
	 */
	public void withdraw(double amount) {
		if (balance < 0 || balance - amount < 0) {
			System.out.println("Sorry, you have overdrawn the account. Please try again.");
		} else {
			balance -= amount;
		}
	}

	/**
	 * Gets the current balance of this bank account.
	 *
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	public void setBalance(double initialBalance) {
		balance = initialBalance;
	}
}

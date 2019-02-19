package chapter10;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class BankAccount {

	private double balance = 0;

	public BankAccount(double inBalance) {
		balance = inBalance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public void formatTo(Formatter formatter, int width, int precision) {
		String balance = Double.toString(Math.round(getBalance()));
		Appendable app = formatter.out();

		Scanner in = new Scanner(balance);
		in.useDelimiter("\\.");
		String part = in.next();
		String frac = in.next();

		if(precision == 0) {
			balance = part;
		} else {
			int zeroes = frac.length();
			while(zeroes < precision) {
				balance += "0";
				zeroes++;
			}
		}

		while(width > balance.length()) {
			balance += " ";
		}

		try {
			app.append(balance);
		} catch (IOException e) {
			System.out.println("Sorry, there was an error appending your balance.");
		}
	}
}

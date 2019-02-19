package chapter10;

import java.util.Formatter;

public class BankAccountTester {

	public static void main(String[] args) {

		Formatter formatter = new Formatter();
		BankAccount a1 = new BankAccount(500);
		a1.deposit(500);
		a1.formatTo(formatter, 4, 0);


	}
}

package chapter7;

import java.util.Scanner;

public class StoreTester {

	public static void main(String[] args) {
		Store store = new Store();
		Scanner in = new Scanner(System.in);
		double amount = -1;

		do {
			System.out.println("Enter the amount the customer spent or zero to quit: ");
			if(in.hasNextDouble()) {
				amount = in.nextDouble();
			} else {
				System.out.println("Please enter a valid number.");
			}
			if(amount > 0) {
				System.out.println("Enter the name of the customer: ");
				if(in.hasNextLine()) {
					String customerName = in.next();
					store.addSale(customerName, amount);
				} else {
					System.out.println("Please enter a valid name.");
				}
			} else if(amount < 0) {
				System.out.println("Amount needs to be greater than zero.");
			}
		} while(amount != 0);
		System.out.printf("The best customer is %s!", store.nameOfBestCustomer());
	}
}

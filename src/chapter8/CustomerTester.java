package chapter8;

import java.util.Scanner;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerLoyalty cl = new CustomerLoyalty();

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a decimal amount in dollars, or q to quit");
		boolean done = true;
		do {
			double input = in.nextDouble();
			cl.makePurchase(input);
			System.out.println("Please enter a decimal amount in dollars, or q to quit");
			if(!in.hasNextDouble()) {
				done = false;
			}
		} while(done);

		if(cl.discountReached()) {
			System.out.println("Congratulations, you have earned a discount! Your total comes out to " + cl.getPurchaseAmount() + " , but with a discount, it is reduced to " + (cl.getPurchaseAmount() - 10));
		} else {
			System.out.println("Sorry, you only purchased " + cl.getPurchaseAmount() + " and do not qualify for a discount.");
		}
	}
}

package chapter6;

import java.util.Scanner;

public class StockPriceTester {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your target stock price: ");
		StockPrice sp = new StockPrice(in.nextDouble());

		System.out.println("Please continue to enter your stock prices, seperating them by a line break.");
		while(in.hasNextDouble()) {
			if(sp.priceChecker(in.nextDouble())) {
				System.out.println("The stock price has exceeded the target price.");
				break;
			}
		}
	}
}

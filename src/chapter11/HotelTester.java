package chapter11;

import java.util.Scanner;

public class HotelTester {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		System.out.println("Please type 0 for the dinner total, 1 for the conference total, or 2 for the lodging total: ");
		Scanner in = new Scanner(System.in);
		int index = in.nextInt();
		System.out.println("Your total for the selected category is: $" + hotel.totalCalculator(index));
	}
}

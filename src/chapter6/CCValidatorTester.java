package chapter6;

import java.util.ArrayList;
import java.util.Scanner;


public class CCValidatorTester {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your credit card number, separated by spaces: ");
		CCValidator cc = new CCValidator(in.nextLine());
		if(cc.validator()) {
			System.out.println("Your card is valid.");
		} else {
			System.out.println("Sorry, your card is not valid.");
		}
	}
}

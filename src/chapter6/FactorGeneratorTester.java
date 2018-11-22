package chapter6;

import java.util.ArrayList;
import java.util.Scanner;


public class FactorGeneratorTester {
	public static void main(String[] args) {

		var in = new Scanner(System.in);
		System.out.println("Please enter an integer to find all of its factors: ");
		int integer = in.nextInt();
		FactorGenerator fg = new FactorGenerator(integer);
		ArrayList<Integer> intList = fg.findIntegers();
		System.out.printf("Here are all of the factors of %d:\n", integer);
		for(int i = 0; i < intList.size(); i++) {
			System.out.printf("%d ", intList.get(i));
		}
	}
}

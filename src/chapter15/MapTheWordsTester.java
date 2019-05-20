package chapter15;

import chapter12.PhoneNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class MapTheWordsTester {

	public static void main(String[] args) {

		MapTheWords mw = new MapTheWords();
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to get all real strings: ");
		int userNum = in.nextInt();
		String userNumString = String.format("%d", userNum);
		System.out.println("All possible words:");

		for(String s: mw.getWords(userNumString)) {
			System.out.println(s);
		}
	}
}

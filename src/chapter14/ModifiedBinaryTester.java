package chapter14;

import java.util.Arrays;
import java.util.Scanner;

/**
 This program demonstrates the binary search algorithm.
 */
public class ModifiedBinaryTester {
	public static void main(String[] args) {
// Construct random array

		int[] a = {5, 25, 1, 7, 2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Scanner in = new Scanner(System.in);

		boolean done = false;
		while (!done) {
			System.out.print
					("Enter number to search for, -1 to quit: ");
			int n = in.nextInt();
			if (n == -1) {
				done = true;
			}
			else {
				int pos = ModifiedBinarySearch.search(a, 0, a.length - 1, n);
				System.out.println("Found in position " + pos);
			}
		}
	}
}
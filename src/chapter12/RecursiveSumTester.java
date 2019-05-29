package chapter12;

import java.util.Arrays;
import java.util.List;

public class RecursiveSumTester {

	public static void main(String[] args) {
		Integer values[] = {1, 3, 5, 7, 11, 13, 19, 23, 29, 31, 37};
		List<Integer> primes = Arrays.asList(values);

		RecursiveSum summer = new RecursiveSum();
		List<List<Integer>> lists = summer.generateSums(primes, 37);
		for(List<Integer> list : lists) {
			for(Integer value : list) {
				System.out.print(value);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

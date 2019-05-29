package chapter12;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, this class can recursively find all lists of elements whose sum is an integer
 */
public class RecursiveSum {
	private List<List<Integer>> sums;

	/**
	 * Creates the sum ArrayList
	 */
	public RecursiveSum() {
		sums = new ArrayList<>();
	}

	/**
	 * Helper method to calculate the sum of the lists
	 * @param values the list of all integers
	 * @param target the target value to sum to
	 * @return list of lists with sum to target
	 */
	public List<List<Integer>> generateSums(List<Integer> values, int target) {
		List<Integer> stack = new ArrayList<>();
		generateSubList(values, stack, 0, target);
		return sums;
	}

	/**
	 * Recursively generates all of the possible sub lists
	 * @param values the list of all integers
	 * @param stack list to build values to
	 * @param from index position
	 * @param target the target value to sum to
	 */
	private void generateSubList(List<Integer> values, List<Integer> stack, int from, int target) {
		if(target == 0) {
			sums.add(new ArrayList(stack));
		} else {
			while (from < values.size() && values.get(from) <= target) {
				stack.add(values.get(from));
				generateSubList(values, stack, from + 1, target - values.get(from));
				stack.remove(stack.size() - 1);
				from++;
			}
		}
	}
}

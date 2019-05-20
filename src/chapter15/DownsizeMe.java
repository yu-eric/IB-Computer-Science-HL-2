package chapter15;

import java.util.LinkedList;

/**
 * This class contains a method which will remove every nth element of a linked list
 */
public class DownsizeMe {

	/**
	 * Removes every nth element from a linked list
	 * @param employeeNames the linked list
	 * @param n the nth element to be removed
	 */
	public static void downsize(LinkedList<String> employeeNames, int n) {
		int i = 1;
		int element = n - 1;
		while(element < employeeNames.size()) {
			employeeNames.remove(element);
			i++;
			element = n * i - i;
		}
	}
}

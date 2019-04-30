package chapter14;

/**
 * This class is a standard insertion sort class with a built in array printer
 */
public class InsertionSort {

	/**
	 * Standard insertion sort method
	 * @param list the list that will be sorted
	 */
	public void sort(int[] list) {
		int n = list.length;
		for (int i = 1; i < n; ++i) {
			int key = list[i];
			int j = i - 1;

			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = key;
		}
	}
}

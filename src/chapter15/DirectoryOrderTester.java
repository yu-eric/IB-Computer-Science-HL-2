package chapter15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DirectoryOrderTester {
	public static void main(String[] args) {
		DirectoryOrder order = new DirectoryOrder();
		List<String> directories = Arrays.asList("dir1", "dir2", "dir3", "dir10", "dir100", "dir11");
		System.out.println("List before sorting: \n" + directories);
		Collections.sort(directories, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return order.compareInt(o1) - order.compareInt(o2);
			}
		});
		System.out.println("\nList after sorting: \n" + directories);
	}
}

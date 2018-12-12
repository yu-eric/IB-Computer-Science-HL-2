package chapter7;

import java.util.Arrays;

public class RandomArrayTester {

	public static void main(String[] args) {
		RandomArray ra = new RandomArray();
		int[] randNums = ra.generateRandomArray();

		System.out.println("The random array generated: " + Arrays.toString(randNums));
		System.out.println("\nEvery element at an even index: " + Arrays.toString(ra.evenIndex(randNums)));
		int[] evenElementArray =ra.evenElement(randNums);
		System.out.print("Every even element: " + "[");
		for(int i : evenElementArray) {
			if(i != 0) {
				System.out.print(i + ", ");
			}
		}

		System.out.println("]\nAll elements in reverse order: " + Arrays.toString(ra.reverseElement(randNums)));
		System.out.println("First and last elements: " + Arrays.toString(ra.firstAndLastElement(randNums)));
	}
}

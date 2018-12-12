package chapter7;

/**
 * This class generates a random array and provides methods to fetch various elements
 */
public class RandomArray {

	/**
	 * Creates a random array of ten integers
	 * @return a random integer array
	 */
	public int[] generateRandomArray() {
		int[] randomArray = new int[10];
		for(int i = 0; i < 10; i++) {
			randomArray[i] = (int) Math.floor((Math.random() * 100) + 1);
		}
		return randomArray;
	}

	/**
	 * This class pulls all elements with an even index
	 * @param numArray the array containing the even index elements
	 * @return an array with all the even index elements
	 */
	public int[] evenIndex(int[] numArray) {
		int[] evenArray = new int[5];
		int counter = 0;
		for(int i = 0; i < 10; i+=2) {
			evenArray[counter] = numArray[i];
			counter++;
		}
		return evenArray;
	}

	/**
	 * This class pulls all even elements in the array
	 * @param numArray the array filled with all even elements
	 * @return an array with even elements
	 */
	public int[] evenElement(int[] numArray) {
		int[] evenElementArray = new int[10];
		int counter = 0;
		for(int i : numArray) {
			if(i % 2 == 0) {
				evenElementArray[counter] = i;
				counter++;
			}
		}
		return evenElementArray;
	}

	/**
	 * This class reverses the input array
	 * @param numArray the reversed array
	 * @return the reversed input array
	 */
	public int[] reverseElement(int[] numArray) {
		int[] reverseArray = new int[10];
		for(int i = 0; i < 10; i++) {
			reverseArray[i] = numArray[9 - i];
		}
		return reverseArray;
	}

	/**
	 * This class takes the first and last elements of the input array
	 * @param numArray an array with the first and last elements
	 * @return the first and last elements contained in an array
	 */
	public int[] firstAndLastElement(int[] numArray) {
		int[] firstAndLastArray = new int[2];
		firstAndLastArray[0] = numArray[0];
		firstAndLastArray[1] = numArray[9];
		return firstAndLastArray;
	}


}

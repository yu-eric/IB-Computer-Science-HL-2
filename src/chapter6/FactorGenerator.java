package chapter6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class finds all the factors of a given integer
 */
public class FactorGenerator {
	int integer;

	/**
	 * Creates an instance of the class
	 * @param numberToFactor the integer to find factors of
	 */
	public FactorGenerator(int numberToFactor) {
		integer = numberToFactor;
	}

	/**
	 * Finds all of the factors of a given integer
	 * @return an ArrayList containing the factors of the number
	 */
	public ArrayList<Integer> findIntegers() {

		/**
		 * just testing the new Java(script) features :)
		 * <p>
		 * I would only do this if the assigned value type can be directly inferred
		 * (i.e. if the assignment is a returned value, this may cause confusion in the type of the variable)
		 * </p>
		 */
		var integerList = new ArrayList<Integer>();
		for(int i = 1; i < integer; i++) {
			if(integer % i == 0 && !integerList.contains(i)) {
				integerList.add(i);
			}
		}
		Collections.sort(integerList);
		return integerList;
	}
}

package chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * This class checks to see if a credit card is valid based on a set of rules.
 */
public class CCValidator {
	ArrayList<Integer> creditCard = new ArrayList<>();

	/**
	 * Creates a new instance of a credit card entered by the user, then converts it into an Integer array.
	 * @param ccListString the user's credit card number
	 */
	public CCValidator(String ccListString) {
		String[] ccListNoWhiteSpace = ccListString.trim().replaceAll("\\s", "").split("(?!^)");
		for(int i = 0; i < ccListNoWhiteSpace.length; i++) {
			creditCard.add(Integer.parseInt(ccListNoWhiteSpace[i]));
		}

	}

	/**
	 * Method to validate the user's credit card number
	 * @return whether the credit card is valid (true) or invalid (false)
	 */
	public boolean validator() {
		int total = 0;
		int secondDigitSum = 0;
		boolean counter = false;
		ArrayList<Integer> largeDigitsArray = new ArrayList<>();

		for(int i = 0; i < creditCard.size(); i++) {
			total += creditCard.get(i);
			if(counter) {
				secondDigitSum += creditCard.get(i);
				largeDigitsArray.add(i);
			}
			counter = !counter;
		}


		if((total + secondDigitSum + largeDigitsArray.size()) % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

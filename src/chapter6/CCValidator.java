package chapter6;

import java.util.ArrayList;
import java.util.List;

public class CCValidator {
	ArrayList<Integer> creditCard = new ArrayList<>();

	public CCValidator(String ccListString) {
		String[] ccListNoWhiteSpace = ccListString.split("(?!^)");
		for(int i = 0; i < ccListNoWhiteSpace.length; i++) {
			creditCard.add(Integer.parseInt(ccListNoWhiteSpace[i]));
		}
		creditCard.remove(4);
		creditCard.remove(9);
		creditCard.remove(14);
	}
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


		if(total + secondDigitSum + largeDigitsArray.size() % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

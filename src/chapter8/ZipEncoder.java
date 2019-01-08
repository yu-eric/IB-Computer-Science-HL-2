package chapter8;

public class ZipEncoder {

	private int[] zipCode;

	/**
	 * Instantiates a new instance of ZipEncoder
	 * @param zipCode int array filled with the zip code
	 */
	public ZipEncoder(int[] zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Adds all digits of the zip code together
	 * @return the total of the zip code
	 */
	private int addDigits() {
		int sum = 0;
		for(int i : zipCode) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Calculates the check digit
	 * @return the check digit
	 */
	private int getCheckDigit() {
		int sum = addDigits();
		int checkDigit = 0;

			while((sum + checkDigit) % 10 != 0) {
				checkDigit++;
			}
			return checkDigit++;
		}

	/**
	 * Encodes the zip code bars based on the number
	 * @param digit The digit of the zip code
	 * @return an encoded zip digit
	 */
	private String encode(int digit) {
		switch(digit) {
			case 0:
				return"||:::";
			case 1:
				return ":::||";
			case 2:
				return "::|:|";
			case 3:
				return "::||:";
			case 4:
				return ":|::|";
			case 5:
				return ":|:|:";
			case 6:
				return ":||::";
			case 7:
				return "|:::|";
			case 8:
				return "|::|:";
			case 9:
				return "|:|::";
			default:
				return "Invalid input.";
		}
	}

	/**
	 * Converts the int array of numbers into the zip code bar format
	 * @return Zip code whole or half bars
	 */
	public String convertZip() {
		String output = "|";
		for(int i : zipCode) {
			output += encode(i);
		}
		output += String.valueOf(encode(getCheckDigit()));
		output += "|";
		return output;
	}
}

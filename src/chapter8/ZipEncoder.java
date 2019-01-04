package chapter8;

public class ZipEncoder {

	private int[] zipCode;

	public ZipEncoder(int[] zipCode) {
		this.zipCode = zipCode;

	}

	private int addDigits() {
		int sum = 0;
		for(int i : zipCode) {
			sum += i;
		}
		return sum;
	}

	private int getCheckDigit() {
		int sum = addDigits();
		int checkDigit = 0;
		if(sum % 10 == 0) {
			checkDigit = 0;
		} else {
			while((sum + checkDigit) % 10 != 0) {
				checkDigit++;
			}
		}
	}
}

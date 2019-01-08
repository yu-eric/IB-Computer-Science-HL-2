package chapter8;

public class ZipDecoder {

	private String encodedZip;

	public ZipDecoder(String encodedZip) {
		this.encodedZip = encodedZip;
	}

	public int[] convertEncodedZip() {
		int[] zipCode = new int[5];
		if (encodedZip.length() < 32) {
			return zipCode;
		}
		zipCode[0] = decode(encodedZip.substring(1, 5));
		zipCode[1] = decode(encodedZip.substring(6, 10));
		zipCode[2] = decode(encodedZip.substring(11, 15));
		zipCode[3] = decode(encodedZip.substring(16, 20));
		zipCode[4] = decode(encodedZip.substring(21, 25));

		return zipCode;
	}

	private int decode(String digit) {
		int value = 0;

		if(digit.charAt(0) == '|') {
			value += 7;
		}
		if(digit.charAt(1) == '|') {
			value += 4;
		}
		if(digit.charAt(2) == '|') {
			value += 2;
		}
		if(digit.charAt(3) == '|') {
			value += 1;
		}

		if(value == 11) {
			value = 0;
		}
		return value;
	}
}

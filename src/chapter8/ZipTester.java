package chapter8;

import java.util.Arrays;

public class ZipTester {

	public static void main(String[] args) {

		int[] zip = new int[]{8,4,0,4,7};

		ZipEncoder ze = new ZipEncoder(zip);
		String encoded = ze.convertZip();
		System.out.printf("Encoded zip is %s\n", encoded);

		ZipDecoder zd = new ZipDecoder(encoded);

		System.out.printf("Zip code is %s", Arrays.toString(zd.convertEncodedZip()));
	}
}

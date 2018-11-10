package chapter5;

import java.util.Scanner;

public class PictureThisTester {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("You will need to enter the coordinates of the two opposite corner points.\n" +
				"Please enter the x-coordinate for the first corner: ");
		int x1 = in.nextInt();
		System.out.println("Please enter the y-coordinate for the first corner: ");
		int y1 = in.nextInt();

		System.out.println("Please enter the x-coordinate for the second corner: ");
		int x2 = in.nextInt();
		System.out.println("Please enter the y-coordinate for the second corner: ");
		int y2 = in.nextInt();

		PictureThis rectangle = new PictureThis(x1, y1, x2, y2);
		if(rectangle.isSquare()) {
			System.out.println("Your rectangle is a square!");
		} else {
			System.out.printf("Your rectangle is in %s orientation!", rectangle.portraitOrLandscape());
		}

	}
}

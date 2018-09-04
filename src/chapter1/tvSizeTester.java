package chapter1;

import java.util.Scanner;

public class tvSizeTester {
    public static void main(String[] args) {
        tvSize tv = new tvSize();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the diagonal length in inches: ");
        double diagSize = in.nextDouble();
        tv.aspectRatioToSize(diagSize);
        System.out.printf("The diagonal length of %.2f inches results in a height of %.2f inches and a width of %.2f inches.", diagSize, tv.getHeight(), tv.getLength());
    }
}

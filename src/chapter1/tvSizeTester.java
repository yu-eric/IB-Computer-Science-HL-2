package chapter1;

import java.util.Scanner;

public class tvSizeTester {
    public static void main(String[] args) {
        tvSize tv = new tvSize();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the diagonal length in inches: ");
        double diagSize = in.nextDouble();

        System.out.println("The diagonal size of " + diagSize + " inches leads to a width of " + tv;);
    }
}

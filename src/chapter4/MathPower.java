package chapter4;

import java.util.Scanner;

/**
 * This class takes the square, cube, and 4th power of a number that is input
 */
public class MathPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to be squared, cubed, and taken to the 4th power: ");
        double num = in.nextDouble();

        System.out.println("Squared: " + num * num);
        System.out.println("Cubed: " + num * num * num);
        System.out.println("4th power: " + Math.pow(num, 4));
    }
}

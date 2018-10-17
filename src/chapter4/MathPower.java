package chapter4;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to be squared, cubed, and quadrupled: ");
        double num = in.nextDouble();

        System.out.println("Squared: " + num * num);
        System.out.println("Cubed: " + num * num * num);
        System.out.println("Quadrupled: " + Math.pow(num, 4));
    }
}

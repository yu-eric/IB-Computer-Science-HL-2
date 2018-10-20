package chapter4;

import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an x-coordinate for your 1st point: ");
        Double x0 = in.nextDouble();
        System.out.println("Please enter an y-coordinate for your 1st point: ");
        Double y0 = in.nextDouble();
        System.out.println("Please enter an x-coordinate for your 2nd point: ");
        Double x1 = in.nextDouble();
        System.out.println("Please enter an y-coordinate for your 2nd point: ");
        Double y1 = in.nextDouble();
        System.out.println("Please enter an x-coordinate for your 3rd point: ");
        Double x2 = in.nextDouble();
        System.out.println("Please enter an y-coordinate for your 3rd point: ");
        Double y2 = in.nextDouble();
        Triangle triangle = new Triangle(x0, y0, x1, y1, x2, y2);

        System.out.printf("%12s %12s %12s %12s \n", "Side Lengths", "Angles", "Perimeter", "Area");
        System.out.println("----------------------------------------------------");
        System.out.printf("%12s %12s %12s %12s \n", triangle.getLine1Length(), triangle.getAngle1(), triangle.getPerimeter(), triangle.getArea());
        System.out.printf("%12s %12s \n", triangle.getLine2Length(), triangle.getAngle2());
        System.out.printf("%12s %12s \n", triangle.getLine3Length(), triangle.getAngle3());
    }
}

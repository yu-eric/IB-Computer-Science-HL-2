package chapter4;

import java.util.Scanner;

/**
 * This class calculates the surface area and volume of an open-ended cone from the given height and radius
 */
public class IceCreamConeTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        double height = in.nextDouble();
        System.out.println("Please enter the radius: ");
        double radius = in.nextDouble();

        IceCreamCone cone = new IceCreamCone(height, radius);

        System.out.printf("The volume of the cone is %.2f cubic units. \n", cone.getVolume());
        System.out.printf("The surface area of the cone is %.2f units squared.", cone.getSurfaceArea());
    }
}

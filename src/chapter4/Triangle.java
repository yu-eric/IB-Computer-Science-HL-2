package chapter4;

import java.awt.geom.Line2D;

/**
 * This class calculates various statistics about a triangle formed by a user's three inputted coordinates
 */
public class Triangle {
    private double x0, y0, x1, y1, x2, y2;
    Line2D.Double line1;
    Line2D.Double line2;
    Line2D.Double line3;

    /**
     *
     * @param x0 The x-coordinate for the 1st point
     * @param y0 The y-coordinate for the 1nd point
     * @param x1 The x-coordinate for the 2nd point
     * @param y1 The y-coordinate for the 2nd point
     * @param x2 The x-coordinate for the 3rd point
     * @param y2 The y-coordinate for the 3rd point
     */
    public Triangle(double userx0, double usery0, double userx1, double usery1, double userx2, double usery2) {
        x0 = userx0;
        x1 = userx1;
        x2 = userx2;
        y0 = usery0;
        y1 = usery1;
        y2 = usery2;

        line1 = new Line2D.Double(x0, y0, x1, y1);
        line2 = new Line2D.Double(x1, y1, x2, y2);
        line3 = new Line2D.Double(x2, y2, x0, y0);
    }



    /**
     * Computes the length of line 1
     * @return The length of line 1
     */
    public Double getLine1Length() {
        return Math.sqrt(Math.pow(line1.getX2() - line1.getX1(), 2) + Math.pow(line1.getY2() - line1.getY1(), 2));
    }

    /**
     * Computes the length of line 2
     * @return The length of line 2
     */
    public Double getLine2Length() {
        return Math.sqrt(Math.pow(line2.getX2() - line2.getX1(), 2) + Math.pow(line2.getY2() - line2.getY1(), 2));
    }

    /**
     * Computes the length of line 3
     * @return The length of line 3
     */
    public Double getLine3Length() {
        return Math.sqrt(Math.pow(line3.getX2() - line3.getX1(), 2) + Math.pow(line3.getY2() - line3.getY1(), 2));
    }

    /**
     * Computes the perimeter of the triangle
     * @return The perimeter of the triangle, in units
     */
    public Double getPerimeter() {
        return getLine1Length() + getLine2Length() + getLine3Length();
    }

    /**
     * Compute the area of the entered triangle using Heron's formula
     * @return The area of the triangle, in units
     */
    public Double getArea() {
        double s = (getPerimeter())/2;
        return Math.sqrt(s * (s - getLine1Length()) * (s - getLine2Length()) * (s-getLine3Length()));
    }

    /**
     * Calculates the angle between lines 1 and 2 using the Math.atan2() method
     * @return the angle in degrees
     */
    public Double getAngle1() {
        Double angle1 = Math.atan2(line1.getY1() - line1.getY2(), line1.getX1() - line1.getX2());
        Double angle2 = Math.atan2(line2.getY1() - line2.getY2(), line2.getX1() - line2.getX2());
        return Math.abs(angle1 - angle2);
    }

    /**
     * Calculates the angle between lines 2 and 3 using the Math.atan2() method
     * @return the angle in degrees
     */
    public Double getAngle2() {
        Double angle1 = Math.atan2(line2.getY1() - line2.getY2(), line2.getX1() - line2.getX2());
        Double angle2 = Math.atan2(line3.getY1() - line3.getY2(), line3.getX1() - line3.getX2());
        return Math.abs(angle1 - angle2);
    }

    /**
     * Calculates the angle between lines 1 and 3 using the Math.atan2() method
     * @return the angle in degrees
     */
    public Double getAngle3() {
        Double angle1 = Math.atan2(line1.getY1() - line1.getY2(), line1.getX1() - line1.getX2());
        Double angle2 = Math.atan2(line3.getY1() - line3.getY2(), line3.getX1() - line3.getX2());
        return Math.abs(angle1 - angle2);
    }

}
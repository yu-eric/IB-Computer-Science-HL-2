package chapter9;

import java.awt.geom.Point2D;

public class LabeledPoint extends Point2D.Double {
	private String label;

	/**
	 * Creates a new LabeledPoint object
	 * @param label the label of the point
	 */
	public LabeledPoint(String label) {
		this.label = label;
	}

	/**
	 * Returns the point in a formatted output
	 * @return the point information
	 */
	public String toString() {
		return label + "\nx: " + getX() + "\ny: " + getY();
	}

	/**
	 * Gets the x coordinate of the point
	 * @return x coordinate
	 */
	@Override
	public double getX() {
		return x;
	}

	/**
	 * Gets the y coordinate of the point
	 * @return the y coordinate
	 */
	@Override
	public double getY() {
		return y;
	}

	/**
	 * Sets the location of the point
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	@Override
	public void setLocation(double x, double y) {
		super.x = x;
		super.y = y;
	}
}

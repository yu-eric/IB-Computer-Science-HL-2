package chapter9;

public class LabeledPoint {
	int x, y;
	String label;

	/**
	 * Creates a new LabeledPoint object
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param label the label of the point
	 */
	public LabeledPoint(int x, int y, String label) {
		this.x = x;
		this.y = y;
		this.label = label;
	}

	/**
	 * Returns the point in a formatted output
	 * @return the point information
	 */
	public String toString() {
		return label + "\nx: " + x + "\ny: " + y;
	}
}

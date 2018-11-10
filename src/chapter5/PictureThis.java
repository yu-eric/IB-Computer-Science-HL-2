package chapter5;

/**
 * Determines if a rectangle is a square, and if not, if it is in landscape or portrait orientation.
 */
public class PictureThis {

	private int x1, y1, x2, y2;

	/**
	 * Maps the four points of the rectangle
	 * @param x1 The 1st x-coordinate
	 * @param y1 The 1st y-coordinate
	 * @param x2 The 2nd x-coordinate
	 * @param y2 The 2nd y-coordinate
	 */
	public PictureThis(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	/**
	 * Checks if the rectangle is a square
	 * @return true or false
	 */
	public boolean isSquare() {
		if(x2 - x1 == y2 - y1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if the rectangle is in landscape or portrait orientation
	 * @return landscape or portrait
	 */
	public String portraitOrLandscape() {
		if(Math.abs(x2 - x1) > Math.abs(y2 - y1)) {
			return "landscape";
		} else {
			return "portrait";
		}
	}
}

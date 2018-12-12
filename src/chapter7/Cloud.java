package chapter7;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * This class represents a cloud filled with points
 */
public class Cloud {

	private final int RADIUS = 5;
	ArrayList<Point2D.Double> pointList ;

	/**\
	 * Constructs a new cloud based on a set of ponts
	 */
	public Cloud() {
		pointList = new ArrayList<Point2D.Double>();
	}

	/**
	 * Adds a point to the cloud
	 * @param aPoint the point to be added
	 */
	public void add(Point2D.Double aPoint) {
		pointList.add(aPoint);
	}

	/**
	 * Draws all the points on the cloud
	 * @param g2 the graphics object
	 */
	public void draw(Graphics2D g2) {
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
		for(Point2D.Double point : pointList) {
			Ellipse2D.Double cloudPoint = new Ellipse2D.Double(point.getX(), point.getY(), RADIUS, RADIUS);
			g2.draw(cloudPoint);
		}
	}
}

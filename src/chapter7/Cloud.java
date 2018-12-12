package chapter7;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Cloud {

	ArrayList<Point2D.Double> pointList = new ArrayList<Point2D.Double>();
	public void add(Point2D.Double aPoint) {
		pointList.add(aPoint);
	}

	public void draw(Graphics2D g2) {
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

		Double x = pointList.get(i).getX();
		Double y = pointList.get(i).getY();


		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);
	}
}

package chapter7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class CloudComponent extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Cloud cloud = new Cloud();
		Random random = new Random(1000);
		double x = 0;
		double y = 0;

		for(int i = 0; i < 100; i++) {
			x = getWidth() + random.nextDouble();
			y = getWidth() + random.nextDouble();
			Point2D.Double point = new Point2D.Double(x, y);
			cloud.add(point);
		}
		cloud.draw(g2);
	}
}

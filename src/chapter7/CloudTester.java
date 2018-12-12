package chapter7;

import javax.swing.*;
import java.awt.geom.Point2D;

public class CloudTester {
	public static void main(String[] args) {
		Cloud cloud = new Cloud();
		JFrame frame = new JFrame("Bridges");


		int counter = 0;
		while(counter < 100) {
			Point2D.Double point = new Point2D.Double(Math.floor((Math.random() * 1000) + 1), Math.floor((Math.random() * 1000) + 1));
			cloud.add(point);
		}
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

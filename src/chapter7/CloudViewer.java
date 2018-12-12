package chapter7;

import javax.swing.*;

public class CloudViewer {
	public static void main(String[] args) {
		Cloud cloud = new Cloud();
		JFrame frame = new JFrame("Cloud Points");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CloudComponent component = new CloudComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}

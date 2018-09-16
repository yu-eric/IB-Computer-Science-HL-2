package chapter2;

import javax.swing.*;

public class ColorNameViewer {
    public static void main(String[] args) {
        ColorNameComponent cnc = new ColorNameComponent();
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(150, 150);
        frame.add(cnc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package chapter3;

import javax.swing.*;

public class BarChartViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bridges");
        BarChartComponent component = new BarChartComponent();

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

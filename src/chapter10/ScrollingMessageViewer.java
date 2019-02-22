package chapter10;

import javax.swing.*;

public class ScrollingMessageViewer {
    public static void main(String[] args) {
        ScrollingFrame frame = new ScrollingFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

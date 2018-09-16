package chapter2;

import javax.swing.*;
import java.awt.*;

public class ColorNameComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.drawString("Black", 10, 10);

        g2.setColor(Color.blue);
        g2.drawString("Blue", 20, 20);

        g2.setColor(Color.cyan);
        g2.drawString("Cyan", 30, 30);

        g2.setColor(Color.darkGray);
        g2.drawString("Dark Gray", 40, 40);

        g2.setColor(Color.gray);
        g2.drawString("Gray", 50, 50);

        g2.setColor(Color.green);
        g2.drawString("Green", 60, 60);

        g2.setColor(Color.lightGray);
        g2.drawString("Light Gray", 70, 70);

        g2.setColor(Color.magenta);
        g2.drawString("Magenta", 80, 80);

        g2.setColor(Color.orange);
        g2.drawString("Orange", 90, 90);

        g2.setColor(Color.pink);
        g2.drawString("Pink", 100, 100);

        g2.setColor(Color.red);
        g2.drawString("Red", 110, 110);

        g2.setColor(Color.white);
        g2.drawString("White", 120, 120);

        g2.setColor(Color.yellow);
        g2.drawString("Yellow", 130, 130);
    }
}

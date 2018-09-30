package chapter3;

import javax.swing.*;
import java.awt.*;

/**
 * This class paints four bridges in a bar chart
 */
public class BarChartComponent extends JComponent {

    /**
     * Paints the four bridges
     * @param g the graphics object
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawRect(10, 10, 420, 50);
        g2.drawString("Golden Gate", 50, 35);

        g2.drawRect(10, 110, 159, 50);
        g2.drawString("Brooklyn", 50, 135);

        g2.drawRect(10, 210, 215, 50);
        g2.drawString("Delaware Memorial", 50, 235);

        g2.drawRect(10, 310, 380, 50);
        g2.drawString("Mackinac", 50, 335);

    }
}

package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class ScrollingComponent extends JComponent {
    private String message;
    private int x;
    private int y;
    private int direction = 5;

    /**
     * Creates an instance of ScrollingComponent
     * @param message the messsage to be displayed
     * @param x the x position of message
     * @param y the y position of message
     */
    public ScrollingComponent(String message, int x, int y) {
        this.message = message;
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        FontRenderContext fontRenderContext = g2.getFontRenderContext();
        TextLayout textLayout = new TextLayout(message, getFont(), fontRenderContext);

        Rectangle2D bounds = textLayout.getBounds();
        if(x + bounds.getWidth() <= 0){
            x = getWidth();
        }
        else if(x > getWidth()){
            x = (int)bounds.getWidth();
        }

        bounds.setRect(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        g2.setColor(getBackground());
        g2.fill(textLayout.getLogicalHighlightShape(0, message.length(), bounds));
        g2.setColor(getForeground());
        textLayout.draw(g2, x, y);
    }

    public void move(){
        x += direction;
    }

    public void reverse(){
        direction *= -1;
    }

    public void setMessage(String message){
        this.message = message;
    }
}

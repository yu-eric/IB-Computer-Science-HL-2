package chapter2;

import java.awt.*;

public class CenteredSquaresPrinter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 100, 200, 200);
        System.out.println(rectangle);

        rectangle.grow(-50, -50);
        rectangle.translate(20, 20);
        System.out.println(rectangle);
    }
}

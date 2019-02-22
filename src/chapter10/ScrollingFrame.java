package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollingFrame extends JFrame {

    public static final int COLUMNS = 30;
    private ScrollingComponent component;
    private Timer timer;
    private final int INCREMENT = 10;

    private static final int fontSizes[] = {5, 10, 15, 20, 54, 100};
    private static final String fontStyle[] = {"Plain", "Bold", "Italics"};
    private static final int fontStyleValues[] = {Font.PLAIN, Font.BOLD, Font.ITALIC};
    private static final String fontFamily[] = {Font.MONOSPACED, Font.SERIF, Font.SANS_SERIF, Font.DIALOG};

    public ScrollingFrame(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        component = new ScrollingComponent("Scroll Component",
                0, 15);

        JButton fasterButton = new JButton("Gotta go fast");
        ActionListener fasterListener = new FasterListener();
        fasterButton.addActionListener(fasterListener);

        JButton slowerButton = new JButton("Sloooower");
        slowerButton.addActionListener(new SlowerListener());

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(new DirectionListener());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(fasterButton);
        buttonPanel.add(slowerButton);
        buttonPanel.add(reverseButton);

        JTextField textField = new JTextField(COLUMNS);
        ActionListener fieldListener = new MessageMutatorListener(textField);
        textField.addActionListener(fieldListener);

        JButton foregroundColorButton = new JButton("Change Foreground Color");
        ActionListener foregroundListener =  new ForegroundColorListener(this);
        foregroundColorButton.addActionListener(foregroundListener);

        JButton backgroundColorButton = new JButton("Change Background Color");
        ActionListener backgroundListener =  new BackgroundColorListener(this);
        backgroundColorButton.addActionListener(backgroundListener);

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new BoxLayout(colorPanel, BoxLayout.X_AXIS));
        colorPanel.add(foregroundColorButton);
        colorPanel.add(backgroundColorButton);

        JComboBox fontNameBox = new JComboBox(fontFamily);
        fontNameBox.addActionListener(new FontNameListener(fontNameBox));

        JComboBox fontStyleBox = new JComboBox(fontStyle);
        ActionListener fontStyleListener = new FontStyleListener(fontStyleBox);
        fontStyleBox.addActionListener(fontStyleListener);

        //TODO Font Size

        JPanel fontPanel = new JPanel();
        fontPanel.setLayout(new BoxLayout(fontPanel, BoxLayout.X_AXIS));
        fontPanel.add(fontNameBox);
        fontPanel.add(fontStyleBox);
        //TODO font size

        JPanel panel2 = new JPanel();
        panel2.add(textField);
        panel2.add(reverseButton);
        panel2.add(buttonPanel);
        panel2.add(colorPanel);
        panel2.add(fontPanel);
        panel.add(component);
        panel.add(panel2);

        add(panel);

        timer = new Timer(INCREMENT, new ScrollListener());
        timer.start();

        //TODO add viewer
        //Set Frame Size
    }

    private class ScrollListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            component.move();
            repaint();
        }
    }
    private class FontStyleListener implements ActionListener{
        private JComboBox comboBox;

        private FontStyleListener(JComboBox comboBox) {
            this.comboBox = comboBox;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Font font = component.getFont();
            Font newFont = new Font(font.getFamily(), fontStyleValues[comboBox.getSelectedIndex()], font.getSize());
            component.setFont(newFont);
            repaint();
        }
    }
    private class FontNameListener implements ActionListener{
        private JComboBox comboBox;

        private FontNameListener(JComboBox comboBox) {
            this.comboBox = comboBox;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Font font = component.getFont();
            Font newFont = new Font(fontFamily[comboBox.getSelectedIndex()], font.getStyle(), font.getSize());
            component.setFont(newFont);
            repaint();
        }
    }

    private class BackgroundColorListener implements ActionListener{
        private Component backgroundComponent;

        private BackgroundColorListener(Component backgroundComponent) {
            this.backgroundComponent = backgroundComponent;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color backgroundColor = JColorChooser.showDialog(backgroundComponent, "Background Color", Color.WHITE);
            if(backgroundColor != null) {
                component.setBackground(backgroundColor);
                repaint();
            }
        }
    }
    private class ForegroundColorListener implements ActionListener{
        private Component colorComponent;

        private ForegroundColorListener(Component component) {
            this.colorComponent = component;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color foregroundColor = JColorChooser.showDialog(colorComponent, "Foreground Color", Color.BLACK);
            if(foregroundColor != null){
                component.setForeground(foregroundColor);
                repaint();
            }
        }
    }
    private class MessageMutatorListener implements ActionListener{
        private JTextField field;

        public MessageMutatorListener(JTextField field) {
            this.field = field;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            component.setMessage(field.getText());
            repaint();
        }
    }

    private class DirectionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            component.reverse();
            repaint();
        }
    }

    private class SlowerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            timer.setDelay(timer.getDelay() + INCREMENT);
        }
    }

    private class FasterListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            timer.setDelay(timer.getDelay() - INCREMENT);
        }
    }

}

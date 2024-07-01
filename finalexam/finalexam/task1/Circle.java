package finalexam.task1;

import javax.swing.*;
import java.awt.*;

public class Circle implements Drawable {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void Draw() {
        JFrame frame = new JFrame("Draw Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new CirclePanel(x, y, radius));
        frame.setVisible(true);
    }

    private static class CirclePanel extends JPanel {
        private int x;
        private int y;
        private int radius;

        public CirclePanel(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(x, y, radius * 2, radius * 2);
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(50, 50, 100);
        circle.Draw();
    }
}

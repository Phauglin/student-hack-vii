import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Obstacle");
        Canvas canvas = new Drawing();
        canvas.setSize(80, 190);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }*/

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(40, 40, 100, 100);
    }
}

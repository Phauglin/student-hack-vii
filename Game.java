import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Canvas;



public class Game extends JFrame{

    private static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {
        Game game = new Game();
        game.init();
    }

    private void init()
    {
        RenderLayer layer = new RenderLayer();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(layer);
        JFrame frame = new JFrame("My Drawing");
        Drawing canvas = new Drawing();
        frame.add(canvas);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setTitle("Some game yeet");
        layer.start();
        // dont touch main at all
    }
}

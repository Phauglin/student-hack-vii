import java.awt.BorderLayout;
import javax.swing.JFrame;


public class TutorialMainClass extends JFrame{

    private static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {
        TutorialMainClass game = new TutorialMainClass();
        game.init();
    }

    private void init()
    {
        RenderLayer layer = new RenderLayer();
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(layer);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setTitle("Flappy Bird Knockoff");
        layer.start();
        // dont touch main at all
    }
}

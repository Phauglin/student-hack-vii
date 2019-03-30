import java.awt.*;
import javax.swing.*;
public class Hack extends JFrame
{

    // Constructor
    public Hack()
    {
        Container contents = getContentPane();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args)
    {
        Hack hack= new Hack();
        hack.setSize(500, 300);
        hack.setVisible(true);

        Jerry jerry = new Jerry(2, 2);
        jerry.setImage();

        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pack();
    }
}

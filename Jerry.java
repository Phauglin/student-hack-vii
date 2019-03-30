import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class Jerry extends JFrame
{
  int xPos;
  int yPos;
  int xSpeed = 0;
  int ySpeed = 0;
  int width = 50;
  int height = 100;

  private ImageIcon image;
  private JLabel label;



  public Jerry(int x, int y)
  {
      xPos = x;
      yPos = y;
  }

  public void render(Graphics g)
  {
      g.setColor(Color.WHITE);
      g.fillRect(xPos, yPos, width, height);
  }

  public void update()
  {
      xPos += xSpeed;
      yPos += ySpeed;
  }

  public Image setImage()
  {
    setLayout(new FlowLayout ());

    image = new ImageIcon(getClass().getResource("jerry.jpg"));
    label = new JLabel(image);

    add(label);
  }
}

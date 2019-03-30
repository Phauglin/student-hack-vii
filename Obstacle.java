import java.awt.Graphics;
import java.awt.Color;


public class Obstacle
{
  float xPos = (int)Math.random();
  float yPos = (int)Math.random();
  int width = 50;
  int height = 50;


  public void render (Graphics g)
  {
    g.setColor(Color.BLACK);
    g.fillRect((int)xPos, (int)yPos, width, height);
  }
}

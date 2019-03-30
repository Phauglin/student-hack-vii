import java.awt.Graphics;
import java.awt.Color;


public class Obstacle
{
  int width = 50;
  int height = 50;
  float xPos = (float)Math.random()*1280;
  float yPos = (float)Math.random()*720;

  public void render (Graphics g)
  {
    g.setColor(Color.BLACK);
    g.fillRect((int)xPos, (int)yPos, width, height);
  }
}

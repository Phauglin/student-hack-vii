import java.awt.Graphics;
import java.awt.Color;


public class Player
{
  float xPos = 500;
  float yPos = 300;
  int width = 50;
  int height = 50;


  public void render (Graphics g)
  {
    g.setColor(Color.BLUE);
    g.fillRect((int)xPos, (int)yPos, width, height);
  }

  public void move(float dx, float dy)
  {
    xPos += dx;
    yPos += dy;
  }





}

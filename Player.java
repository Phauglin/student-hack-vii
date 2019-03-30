import java.awt.Graphics;
import java.awt.Color;


public class Player
{
  float xPos = 500;
  float yPos = 300;
  int width = 50;
  int height = 50;

  boolean holdsW = false;
  boolean holdsA = false;
  boolean holdsS = false;
  boolean holdsD = false;

  float xSpeed = 0;
  float ySpeed = 0;
  float gravity = 0.2f;


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

  public void update()
  {
    xPos += xSpeed;
    yPos += ySpeed;
  }




}

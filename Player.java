import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

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

  Rectangle r2 = new Rectangle((int) xPos, (int) yPos, width, height);
  public void render (Graphics g)
  {
    Graphics2D g2D = (Graphics2D) g;
    g.setColor(Color.WHITE);
    g2D.draw(r2);
    g.setColor(Color.WHITE);
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
    r2.setLocation((int) xPos, (int) yPos);
  }

  public Rectangle getPlayer()
  {
    return r2;
  }
}

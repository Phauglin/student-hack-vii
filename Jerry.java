import java.awt.Graphics;
import java.awt.Color;

public class Jerry
{
  int xPos;
  int yPos;
  int xSpeed = 0;
  int ySpeed = 0;
  int width = 50;
  int height = 100;

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
}

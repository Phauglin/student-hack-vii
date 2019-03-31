import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;


public class Obstacle
{
  int width = 70;
  int height = 70;
  float xPos = (float)(Math.random()*1280);
  float yPos = (float)(Math.random()*720);
  Rectangle r = new Rectangle( (int) xPos, (int) yPos, width, height);
  //float xPos = -1;
  //float yPos = -1;

  //(((xPos + 35.0) > 1280.0) && ((xPos - 35.0) < 0.0) && ((yPos + 35.0) > 720.0) && ((yPos - 35.0) < 0.0));

  public void render (Graphics g)
  {

  //  do {
  //    xPos = (float)(Math.random()*1280);
  //    yPos = (float)(Math.random()*720);
  //  } while (((xPos + 35.0) > 1280.0) && ((xPos - 35.0) < 0.0) && ((yPos + 35.0) > 720.0) && ((yPos - 35.0) < 0.0));
    g.setColor(Color.BLACK);
    g.fillRect((int)xPos, (int)yPos, width, height);
  }

  public Rectangle getObstacle()
  {
    return r;
  }

  public int getHeight()
  {
    return height;
  }

  public int getWidth()
  {
    return width;
  }

  public void setHeight(int newHeight)
  {
    height= newHeight;
  }

  public void setWidth(int newWidth)
  {
    width = newWidth;
  }
}


//

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class GameController implements MouseListener, KeyListener
{

  Player p = new Player();
  Obstacle o = new Obstacle();

  public void update()
  {
    if(isColliding())
    {
      o.xPos = (float)Math.random()*1280;
      o.yPos = (float)Math.random()*720;
    }
    //System.out.println(p.ySpeed);
    p.ySpeed += p.gravity;
    p.xSpeed *= 0.97f;
    p.update();

    if(p.holdsW)
    {
      p.ySpeed -= 0.5;
    }

    if(p.holdsS)
    {
      p.ySpeed += 0.5;
    }

    if(p.holdsA)
    {
      p.xSpeed -= 0.5;

    }

    if(p.holdsD)
    {
      p.xSpeed += 0.5;
    }

    if(p.xPos < 0)
    {
      p.xPos = 0;
      p.xSpeed = -p.xSpeed * 0.7f;
    }

    if(p.xPos > 1280 - p.width)
    {
      p.xPos = 1280 - p.width;
      p.xSpeed = -p.xSpeed * 0.7f;
    }

    if(p.yPos < 0)
    {
      p.yPos = 0;
      p.ySpeed = 0;
    }

    if((p.yPos > 720 - p.height) && p.ySpeed != 0)
    {
      p.yPos = 720 - p.height;
      p.ySpeed = -p.ySpeed * 0.7f;
    }
  }

  public boolean isColliding()
  {
    if(p.xPos <= o.xPos + o.height && p.yPos == o.yPos)
      return true;
    else
      return false;
  }

  public void render(Graphics g)
  {
    g.setColor(Color.magenta);
    g.fillRect(0, 0, 1280, 720);

    p.render(g);
    o.render(g);
  }

  @Override
  public void mouseReleased(MouseEvent e)
  {

  }

  @Override
  public void mousePressed(MouseEvent e)
  {

  }


  @Override
  public void keyReleased(KeyEvent e)
  {
    switch(e.getKeyChar())
    {
      case 'w': p.holdsW = false; break;
      case 's': p.holdsS = false; break;
      case 'a': p.holdsA = false; break;
      case 'd': p.holdsD = false; break;
    }

  }

  @Override
  public void keyPressed(KeyEvent e)
  {
    switch(e.getKeyChar())
    {
      case 'w': p.holdsW = true; break;
      case 's': p.holdsS = true; break;
      case 'a': p.holdsA = true; break;
      case 'd': p.holdsD = true; break;
    }

  }

  @Override
  public void mouseClicked(MouseEvent arg0)
  {

  }


  @Override
  public void mouseEntered(MouseEvent arg0)
  {

  }


  @Override
  public void mouseExited(MouseEvent arg0)
  {

  }

  @Override
  public void keyTyped(KeyEvent arg0)
  {

  }
}

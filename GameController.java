import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;



public class GameController implements MouseListener, KeyListener
{

  Player p = new Player();

  public void update()
  {

  }

  public void render(Graphics g)
  {
    g.setColor(Color.magenta);
    g.fillRect(0, 0, 1280, 720);
    p.render(g);
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

  }

  @Override
  public void keyPressed(KeyEvent e)
  {

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


  @Override
  public void mouseMoved(MouseEvent e)
  {
    
  }


  @Override
  public void mouseDragged(MouseEvent e)
  {

  }
}

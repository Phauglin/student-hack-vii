import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RenderLayer extends Canvas implements Runnable
{
  private static final long serialVersionUID = 1L; //dont touch

  long time;

  GameController gmc = new GameController();

  ArrayList<Tom> enemies = new ArrayList<Tom>();

  public RenderLayer()
  {
    super();
    this.setSize(1280, 720);
    time = System.currentTimeMillis();
    this.addKeyListener(gmc);
    this.addMouseListener(gmc);
  }
  
  @Override
  public void run()
  {
    while (true)
      {
        try
        {
    			Thread.sleep(17);
    		} catch (InterruptedException e) {}

        this.render();
        gmc.update();
        time = System.currentTimeMillis();
    }
  }


  private void render()
  {
  	// dont touch start
      BufferStrategy buffer = this.getBufferStrategy();
      if (buffer == null)
      {
          this.createBufferStrategy(3);
          return;
      }
      Graphics g = buffer.getDrawGraphics();
      // dont touch end

      g.setColor(new Color(190,190,190)); // sets background clr

      // fillrect takes arguments: xPos, yPos, width, height
      gmc.render(g);
      g.dispose(); //dt
      buffer.show(); // dt

  }

  public void start() //dt
  {
      Thread t = new Thread(this);
      t.start();
  }
}

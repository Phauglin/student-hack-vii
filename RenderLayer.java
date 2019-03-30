import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RenderLayer extends Canvas implements Runnable, KeyListener, MouseListener
{
    private static final long serialVersionUID = 1L; //dont touch

    long time;

    ArrayList<Tom> enemies = new ArrayList<Tom>();

    public RenderLayer() //dont touchhh
    {
        super();
        this.setSize(1080, 720);
        time = System.currentTimeMillis();
        this.addKeyListener(this);
        this.addMouseListener(this);
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
            this.update();
            time = System.currentTimeMillis();
        }
    }

    private void update()
    {
    	for (Tom e : enemies)
    	{
    		e.update();
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

        g.fillRect(0, 0, 1080, 720);
        for (Tom e : enemies)
        {
        	e.render(g);
        }

        g.dispose(); //dt
        buffer.show(); // dt

    }

    public void start() //dt
    {
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void mousePressed(MouseEvent e) // creates new tom at mouse cursor
    {
    	enemies.add(new Tom(e.getX(), e.getY()));
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {

    }
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}

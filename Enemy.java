import java.awt.Graphics;
import java.awt.Color;

public class Enemy
{
    int xPos;
    int yPos;
    int xSpeed = 5;
    int ySpeed = 1;
    int width = 50;
    int height = 50;

    public Enemy(int x, int y)
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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class SnakePanel extends JPanel
{
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(Color.RED);
        g2d.fillOval(100, 100, 20, 20);
    }    
}

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel snake = new SnakePanel();
        frame.add(snake);
    }
}
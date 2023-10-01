import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyInputVector implements Vector
{
    KeyPressBool up;
    KeyPressBool down;
    KeyPressBool left;
    KeyPressBool right;
    public KeyInputVector(JFrame frame)
    {
        up = new KeyPressBool(KeyEvent.VK_W);
        down = new KeyPressBool(KeyEvent.VK_S);
        left = new KeyPressBool(KeyEvent.VK_A);
        right = new KeyPressBool(KeyEvent.VK_D);
        frame.addKeyListener(up);
        frame.addKeyListener(down);
        frame.addKeyListener(left);
        frame.addKeyListener(right);
    }

    @Override
    public void accept(VectorConsumer consumer) {
        up.accept(up -> down.accept(down -> left.accept(left -> right.accept(right ->
        {
            int x = right ? 1 : left ? -1 : 0;
            int y = up ? 1 : down ? -1 : 0;
            consumer.consume(x, y);
        }))));
    }
    
}

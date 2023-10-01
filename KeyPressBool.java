import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressBool implements KeyListener, Bool
{
    int keyCode; //KeyEvent.VK_#
    boolean isPressing;
    public KeyPressBool(int keyCode)
    {
        this.keyCode = keyCode;
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == keyCode) isPressing = true;
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == keyCode) isPressing = false;
    }

    @Override
    public void accept(BoolConsumer consumer)
    {
        consumer.consume(isPressing);
    }
    
}

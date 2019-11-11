import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyHelloPanelListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends MouseAdapter implements KeyListener
{      
    JLabel ml;
    JPanel mp;
    public void MyHelloPanelListener(){
        ml = new JLabel("HELLO");
        ml.addMouseListener(new MyHelloPanelListener());
        ml.addKeyListener(new MyHelloPanelListener());
        mp.add(ml);
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        if(keyCode == e.VK_DOWN)
            ml.setLocation(ml.getX(), ml.getY() + 10);        
        else if(keyCode == e.VK_UP)
            ml.setLocation(ml.getX(), ml.getY() - 10);        
        else if(keyCode == e.VK_RIGHT)
            ml.setLocation(ml.getX() + 10, ml.getY());      
        else
            ml.setLocation(ml.getX() - 10, ml.getY()); 
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}

    public void mousePressed(MouseEvent e){
        ml.setLocation(e.getX(), e.getY());
    }
}

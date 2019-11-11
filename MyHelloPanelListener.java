import java.awt.event.*;
import javax.swing.*;
/**
 * Panel과 Listener 객체를 만들고 등록하는 클래스.
 *
 * @author (2017315002 김아름, 2018315021 방대호) 
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel
{      
    JLabel ml  = new JLabel("HEllO");
    public MyHelloPanelListener(JLabel ml){
        this.ml = ml;
        this.setFocusable(true);
        this.requestFocus();
        this.addMouseListener(new MyHelloListener());
        this.addKeyListener(new MyHelloListener());
    }
    class MyHelloListener extends MouseAdapter implements KeyListener{
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
}

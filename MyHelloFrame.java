import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 프레임을 만들고 label에 리스너를 등록하는 클래스.
 * 
 * @author (2017315002 김아름, 2018315021 방대호) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{
    public JLabel ml;
    
    public MyHelloFrame(){
        setTitle("실습_3 (2019.11.11)");
        setSize(300, 300);
        
        ml = new JLabel("HELLO");
        JPanel mp = new MyHelloPanelListener(ml);
        mp.add(ml);
        this.add(mp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

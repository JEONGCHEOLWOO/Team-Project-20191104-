import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyMouseFrame here.
 *
 * @author (2018315031 박성현, 2018315040 김선민, 2018315034 정철우)
 * @version (2019/11/04)
 */
public class MyMouseFrame extends JFrame
{
    public JPanel jp;
    private JLabel jl = new JLabel("No Mouse Event");

    public MyMouseFrame(){
        this.setTitle("MouseListener & MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        
        JPanel jp = new JPanel();
        
        this.add(jp);
        MyMouseListener ml = new MyMouseListener(jl,jp);
        jp.addMouseListener(ml);
        jp.addMouseMotionListener(ml);
        
        jp.add(jl);
        jl.setSize(300,200);
        this.setVisible(true);
    }

}

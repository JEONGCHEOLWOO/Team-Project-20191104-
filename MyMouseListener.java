import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (2018315031 박성현, 2018315040 김선민, 2018315034 정철우)
 * @version (2019/11/04)
 */
public class MyMouseListener extends MouseAdapter implements MouseListener
{
    JPanel jp;
    JLabel jl;
    public MyMouseListener(JLabel jl, JPanel jp){
        this.jp = jp;
        this.jl = jl;
    }
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
        JPanel jp = (JPanel)e.getSource();
        jp.setBackground(Color.CYAN);
    }
    public void mouseExited(MouseEvent e){
        JPanel jp = (JPanel)e.getSource();
        jp.setBackground(Color.YELLOW);
    }
    public void mousePressed(MouseEvent e){
        jl.setText("MousePressed (" + e.getX() + "," + e.getY() + ")");
    }
    public void mouseReleased(MouseEvent e){
        jl.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")");
    }
    public void mouseDragged(MouseEvent e){
        jl.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
    }
    public void mouseMoved(MouseEvent e){
        jl.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
    }
}

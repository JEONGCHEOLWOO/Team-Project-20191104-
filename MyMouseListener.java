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
// MouseListener인 인터페이스 상속(inplements), MouseAdapter 클래스 상속(extends)
{
    JPanel jp;
    JLabel jl;
    public MyMouseListener(JLabel jl, JPanel jp){
        this.jp = jp;
        this.jl = jl;
    }

    // 인터페이스 MouseListener 내의 메소드
    public void mouseClicked(MouseEvent e){} // 패널 안에서 마우스 버튼를 클릭할 때

    public void mouseEntered(MouseEvent e){ // 마우스가 패널 안에 들어갈 때 
        JPanel jp = (JPanel)e.getSource(); // 이벤트를 발생시킨 객체의 위치값 가져오기
        jp.setBackground(Color.CYAN); // 패널의 배경색 설정
    }

    public void mouseExited(MouseEvent e){ // 마우스가 패널 밖으로 나갈 때
        JPanel jp = (JPanel)e.getSource(); // 이벤트를 발생시킨 객체의 위치값 가져오기
        jp.setBackground(Color.YELLOW); // 패널의 배경색 설정
    }

    public void mousePressed(MouseEvent e){ // 패널 안에서 마우스 버튼을 눌렀을 떼
        jl.setText("MousePressed (" + e.getX() + "," + e.getY() + ")"); 
    } // label 변경 / X, Y좌표 가져오기

    public void mouseReleased(MouseEvent e){ // 패널 안에서 마우스 버튼을 누르고 놓았을 때
        jl.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")"); 
    } // label 변경 / X, Y좌표 가져오기

    public void mouseDragged(MouseEvent e){ // 패널 안에서 드래그할 때(마우스를 누른 채 움직인다) 
        jl.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
    } // label 변경 / X, Y좌표 가져오기

    public void mouseMoved(MouseEvent e){ // 마우스 커서가 패널 안에서 이동할 때
        jl.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
    } // label 변경 / X, Y좌표 가져오기
}

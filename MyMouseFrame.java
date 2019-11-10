import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyMouseFrame here.
 *
 * @author (2018315031 박성현, 2018315040 김선민, 2018315034 정철우)
 * @version (2019/11/04)
 */
public class MyMouseFrame extends JFrame // JFrame 클래스 상속받기
{
    public JPanel jp;
    private JLabel jl = new JLabel("No Mouse Event"); //레이블 생성

    public MyMouseFrame(){
        this.setTitle("MouseListener & MouseMotionListener"); //프레임의 title 이름설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료시 프로세스까지 모두 종료
        this.setSize(300, 400); // 프레임 사이즈 설정

        JPanel jp = new JPanel(); //패널 생성

        this.add(jp); // 프레임에 패널을 붙임
        MyMouseListener ml = new MyMouseListener(jl,jp);
        jp.addMouseListener(ml);
        jp.addMouseMotionListener(ml);

        jp.add(jl); //패널에 레이블 추가
        jl.setSize(300,200);
        //jl.setPreferredSize(new Dimension(200, 200)); //label 위치 변경
        this.setVisible(true); //화면에 나타냄
    }

}

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class ex6 extends JFrame {
	private JLabel label;
	private int x, y;
	public ex6 () {
		setTitle("클릭연습용");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //컨텐트팬의 배치관리자 삭제

		x = 100;
		y = 100;
		label = new JLabel("C");
		label.setSize(50, 50);
		label.setLocation(x, y);
		
		c.addMouseListener(new MouseAdapter () { //Mouse리스너달기
			public void mouseClicked (MouseEvent e) { //마우스로 컴포넌트를 클릭하였을 때(마우스 버튼이 떼어지는 순간 호출)
				Random ran = new Random(); 
				x = ran.nextInt(400);
				y = ran.nextInt(400);
				label.setLocation(x, y);
		   }
		});
		
		c.add(label);
		setVisible(true);
		}
	public static void main(String[] args) {
		new ex6 ();
	}
}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1 extends JFrame {
	public ex1() {
		super("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) { //마우스가 컴포넌트 위에 올라갈 때
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) { //마우스가 컴포넌트에서 내려올 때
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});

		setSize(150,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new ex1();
	}
}
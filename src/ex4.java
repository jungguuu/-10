import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ex4 extends JFrame {
		private JLabel label;
		private String text;
	public ex4 () {
		setTitle("한문자씩 왼쪽으로 회전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		text = "Love Java";
		label = new JLabel("Love Java");
		label.setSize(80, 20);
		add(label);
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {  
				if(e.getKeyCode() == KeyEvent.VK_LEFT)  { //키코드값에 따라 판별 후 이동
					String moveString = text.substring(1) + text.substring(0, 1);
					text = new String(moveString);
					label.setText(moveString);
			    }
		   }   
		});
		  
		setSize(400, 200);
		setVisible(true);
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정 
	 }
	 public static void main(String[] args) {
		 new ex4();
	 }

}


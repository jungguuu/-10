import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ex4 extends JFrame {
		private JLabel label;
		private String text;
	public ex4 () {
		setTitle("�ѹ��ھ� �������� ȸ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		text = "Love Java";
		label = new JLabel("Love Java");
		label.setSize(80, 20);
		add(label);
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {  
				if(e.getKeyCode() == KeyEvent.VK_LEFT)  { //Ű�ڵ尪�� ���� �Ǻ� �� �̵�
					String moveString = text.substring(1) + text.substring(0, 1);
					text = new String(moveString);
					label.setText(moveString);
			    }
		   }   
		});
		  
		setSize(400, 200);
		setVisible(true);
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ���� 
	 }
	 public static void main(String[] args) {
		 new ex4();
	 }

}


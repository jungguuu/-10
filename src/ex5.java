import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ex5 extends JFrame {
	public ex5() {
		setTitle("��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("Arial", Font.PLAIN, 10)); //Arial ��Ʈ�� 10�ȼ�ũ��
		label.addKeyListener(new KeyAdapter() { //key�����ʴޱ�
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ����
	}
	static public void main(String [] args) {
		new ex5();
	}
}
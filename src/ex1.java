import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1 extends JFrame {
	public ex1() {
		super("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // ����Ʈ�ҿ� ���̱�
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) { //���콺�� ������Ʈ ���� �ö� ��
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) { //���콺�� ������Ʈ���� ������ ��
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});

		setSize(150,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new ex1();
	}
}
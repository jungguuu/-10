import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class ex6 extends JFrame {
	private JLabel label;
	private int x, y;
	public ex6 () {
		setTitle("Ŭ��������");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //����Ʈ���� ��ġ������ ����

		x = 100;
		y = 100;
		label = new JLabel("C");
		label.setSize(50, 50);
		label.setLocation(x, y);
		
		c.addMouseListener(new MouseAdapter () { //Mouse�����ʴޱ�
			public void mouseClicked (MouseEvent e) { //���콺�� ������Ʈ�� Ŭ���Ͽ��� ��(���콺 ��ư�� �������� ���� ȣ��)
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



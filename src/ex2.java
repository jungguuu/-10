import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ex2 extends JFrame{
	public ex2() {
		setTitle("�ʷϻ� -�巡��-> �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
				
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent e) {} //���콺�� ������Ʈ�� Ŭ���Ͽ��� ��(���콺 ��ư�� �������� ���� ȣ��)
		@Override
		public void mouseEntered(MouseEvent e) {} //���콺�� ������Ʈ ���� �ö� ��
		@Override
		public void mouseExited(MouseEvent e) {} //���콺�� ������Ʈ���� ������ ��
		@Override
		public void mousePressed(MouseEvent e) {} //���콺 ��ư�� �������� ��
		@Override
		public void mouseReleased(MouseEvent e) { //������ ��ư�� ������ ��
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		@Override
		public void mouseDragged(MouseEvent e) { //���콺�� �巡�� �Ǵ� ����
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseMoved(MouseEvent e) {} //���콺�� �����̴� ����
	}
	
	public static void main(String[] args) {
		new ex2();

	}

}

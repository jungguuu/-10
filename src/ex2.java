import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ex2 extends JFrame{
	public ex2() {
		setTitle("초록색 -드래그-> 노란색");
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
		public void mouseClicked(MouseEvent e) {} //마우스로 컴포넌트를 클릭하였을 때(마우스 버튼이 떼어지는 순간 호출)
		@Override
		public void mouseEntered(MouseEvent e) {} //마우스가 컴포넌트 위에 올라갈 때
		@Override
		public void mouseExited(MouseEvent e) {} //마우스가 컴포넌트에서 내려올 때
		@Override
		public void mousePressed(MouseEvent e) {} //마우스 버튼이 눌러졌을 때
		@Override
		public void mouseReleased(MouseEvent e) { //눌러진 버튼이 떼어질 때
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		@Override
		public void mouseDragged(MouseEvent e) { //마우스가 드래그 되는 동안
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseMoved(MouseEvent e) {} //마우스가 움직이는 동안
	}
	
	public static void main(String[] args) {
		new ex2();

	}

}

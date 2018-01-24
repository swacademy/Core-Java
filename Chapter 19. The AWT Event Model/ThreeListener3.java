//Inner Class를 이용한 Adapter Class 사용법
import java.awt.*;
import java.awt.event.*;

public class  ThreeListener3{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("Three Listener Test");
		f.addMouseListener(new MouseHandler()); 
		f.addMouseMotionListener(new MouseMotionHandler());
		f.addWindowListener(new WindowHandler());
		tf = new TextField(30);
		f.add(new Label("Click and Drag the mouse"), "North");
		f.add(tf, "South");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	class MouseHandler extends MouseAdapter{
		public void mouseEntered(MouseEvent e){
			String str = "Mouse 입장이요";
			tf.setText(str);
		}
		public void mouseExited(MouseEvent e){
			String str = "Mouse 출타요";
			tf.setText(str);
		}
	};
	class MouseMotionHandler extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e){
			String str = "현 마우스 위치: X = " + e.getX();
			str += ", Y = " + e.getY();
			tf.setText(str);
		}
	};
	class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			f.setVisible(false);
			f.dispose();    //자원반납
			System.exit(0);  //종료
		}
	};
	public static void main(String[] args) {
		new ThreeListener3().go();
	}
}

//Anonymous Class를 이용하자.
import java.awt.*;
import java.awt.event.*;

public class  ThreeListener4{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("Three Listener Test");
		f.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				String str = "Mouse 입장이요";
				tf.setText(str);
			}
			public void mouseExited(MouseEvent e){
				String str = "Mouse 출타요";
				tf.setText(str);
			}	
		});  

		f.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				String str = "현 마우스 위치: X = " + e.getX();
				str += ", Y = " + e.getY();
				tf.setText(str);
			}		
		});

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();    //자원반납
				System.exit(0);  //종료
			}
		});

		tf = new TextField(30);
		f.add(new Label("Click and Drag the mouse"), "North");
		f.add(tf, "South");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreeListener4().go();
	}
}

//별도의 클래스를 생성을 통해 이벤트 구현
import java.awt.*;
import java.awt.event.*; 

public class  ThreeListener1{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("Three Listener Test");
		tf = new TextField(30);
		f.addMouseListener(new MouseHandler(this.tf));  
		f.addMouseMotionListener(new MouseMotionHandler(this.tf));
		f.addWindowListener(new WindowHandler(this.f));
		f.add(new Label("Click and Drag the mouse"), "North");
		f.add(tf, "South");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreeListener1().go();
	}
}

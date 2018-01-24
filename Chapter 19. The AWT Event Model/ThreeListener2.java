//별도 이벤트 클래스 구현하기
import java.awt.*;
import java.awt.event.*;  //1. 
public class  ThreeListener2{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("Three Listener Test");
		tf = new TextField(30);
		f.addMouseListener(new MouseHandler1(this.tf));  //2. 
		f.addMouseMotionListener(new MouseMotionHandler1(this.tf));
		f.addWindowListener(new WindowHandler1(this.f));
		f.add(new Label("Click and Drag the mouse"), "North");
		f.add(tf, "South");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ThreeListener2().go();
	}
}

import java.awt.*;
import java.awt.event.*;  //1. 
public class  ThreeListener 
	implements MouseListener, MouseMotionListener, WindowListener{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("Three Listener Test");
		f.addMouseListener(this);  //2. 
		f.addMouseMotionListener(this);
		f.addWindowListener(this);
		tf = new TextField(30);
		f.add(new Label("Click and Drag the mouse"), "North");
		f.add(tf, "South");
		f.setSize(300, 300);
		f.setVisible(true);
	}
	//MouseListener
	public void mouseEntered(MouseEvent e){
		String str = "Mouse 입장이요";
		tf.setText(str);
	}
	public void mouseExited(MouseEvent e){
		String str = "Mouse 출타요";
		tf.setText(str);
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	//MouseMotionListener
	public void mouseDragged(MouseEvent e){
		String str = "현 마우스 위치: X = " + e.getX();
		str += ", Y = " + e.getY();
		tf.setText(str);
	}
	public void mouseMoved(MouseEvent e){}
	//WindowListener
	public void windowClosing(WindowEvent e){
		f.setVisible(false);
		f.dispose();    //자원반납
		System.exit(0);  //종료
	}
	public void windowOpened(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public static void main(String[] args) {
		new ThreeListener().go();
	}
}

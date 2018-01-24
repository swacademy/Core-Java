import java.awt.*;
import java.awt.event.*;

public class MouseMotionHandler implements MouseMotionListener{
	private TextField tf;
	public MouseMotionHandler(TextField tf){
		this.tf = tf;
	}
	public void mouseDragged(MouseEvent e){
		String str = "현 마우스 위치: X = " + e.getX();
		str += ", Y = " + e.getY();
		tf.setText(str);
	}
	public void mouseMoved(MouseEvent e){}
}

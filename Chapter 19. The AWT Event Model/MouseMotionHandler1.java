import java.awt.*;
import java.awt.event.*;

class MouseMotionHandler1 extends MouseMotionAdapter{
	private TextField tf;
	public MouseMotionHandler1(TextField tf){
		this.tf = tf;
	}
	public void mouseDragged(MouseEvent e){
		String str = "현 마우스 위치: X = " + e.getX();
		str += ", Y = " + e.getY();
		tf.setText(str);
	}
};
import java.awt.*;
import java.awt.event.*;

class MouseHandler1 extends MouseAdapter{
	private TextField tf;
	public MouseHandler1(TextField tf){
		this.tf = tf;
	}
	public void mouseEntered(MouseEvent e){
		String str = "Mouse 입장이요";
		tf.setText(str);
	}
	public void mouseExited(MouseEvent e){
		String str = "Mouse 출타요";
		tf.setText(str);
	}
};
import java.awt.*;
import java.awt.event.*;

class MouseHandler implements MouseListener{
	private TextField tf;
	public MouseHandler(TextField tf){
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
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}

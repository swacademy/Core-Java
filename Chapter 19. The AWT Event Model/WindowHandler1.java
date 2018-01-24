import java.awt.*;
import java.awt.event.*;

class WindowHandler1 extends WindowAdapter{
	private Frame f;
	public WindowHandler1(Frame f){
		this.f = f;
	}
	public void windowClosing(WindowEvent e){
		f.setVisible(false);
		f.dispose();    //자원반납
		System.exit(0);  //종료
	}
};
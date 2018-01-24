import java.awt.*;
import java.awt.event.*;

public class WindowHandler implements WindowListener{
	private Frame f;
	public WindowHandler(Frame f){
		this.f = f;
	}
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
}

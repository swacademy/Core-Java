import java.awt.*;
import java.awt.event.*;

public class TextFieldTest extends KeyAdapter{
	private Frame f;
	private TextField tf;
	public void go(){
		f = new Frame("TextField Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		tf = new TextField(30);
		tf.addKeyListener(this);
		f.add(tf, "South");
		f.pack();
		f.setVisible(true);
	}
	public void keyPressed(KeyEvent e){
		char ch = e.getKeyChar();
		if(Character.isDigit(ch)){   //숫자라면
			e.consume();
		}
	}
	public static void main(String[] args) {
		new TextFieldTest().go();
	}
}

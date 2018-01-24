import java.awt.*;
import java.awt.event.*;

class CursorTest implements ActionListener{
	private Frame f;
	private Button b1, b2, b3, b4, b5;
	public void go(){
		f = new Frame("Cursor Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setLayout(new FlowLayout());
		b1 = new Button("Default");
		b1.addActionListener(this);
		b2 = new Button("CrossHair");
		b2.addActionListener(this);
		b3 = new Button("Move");
		b3.addActionListener(this);
		b4 = new Button("Wait");
		b4.addActionListener(this);
		b5 = new Button("Hand");
		b5.addActionListener(this);
		f.add(b1);    f.add(b2);    f.add(b3);
		f.add(b4);    f.add(b5);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if(str=="Default"){
			f.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}else if(str=="CrossHair"){
			f.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		}else if(str=="Move"){
			f.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		}else if(str=="Wait"){
			f.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		}else if(str=="Hand"){
			f.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
	}
	public static void main(String[] args) {
		new CursorTest().go();
	}
}
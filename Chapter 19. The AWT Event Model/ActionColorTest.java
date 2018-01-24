import java.awt.*;
import java.awt.event.*;
public class ActionColorTest implements ActionListener{
	private Frame f;
	private Panel p;
	private Button bRed, bBlue, bGreen;
	public void go(){
		f = new Frame("Color Test");
		p = new Panel();
		bRed = new Button("Red");
		bRed.addActionListener(this);
		bRed.setBackground(Color.red);
		bBlue = new Button("Blue");
		bBlue.addActionListener(this);
		bBlue.setBackground(Color.blue);
		bGreen = new Button("Green");
		bGreen.addActionListener(this);
		bGreen.setBackground(Color.green);
		p.add(bRed);   p.add(bBlue);   p.add(bGreen);
		f.add(p, "South");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String title = e.getActionCommand();
		if(title == "Red"){
			f.setBackground(Color.red);
		}else if(title == "Blue"){
			f.setBackground(Color.blue);
		}else{
			f.setBackground(Color.green);
		}
	}
	public static void main(String[] args) {
		new ActionColorTest().go();	
	}
}

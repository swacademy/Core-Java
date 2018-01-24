import java.awt.*;
import java.awt.event.*;
public class ToggleButton implements ActionListener{
	private Frame f;
	private Panel p;
	private Button b;
	public void go(){
		f = new Frame("Toggle Test");
		p = new Panel();
		b = new Button("Red");
		b.addActionListener(this);
		b.setBackground(Color.red);
		b.setForeground(Color.blue);
		p.add(b);
		f.add(p, "North");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getSource().toString());
		System.out.println(((Button)e.getSource()).getLabel());
		String str = e.getActionCommand();
		//System.out.println("paramString() = " + e.paramString());
		//System.out.println("getID() = " + e.getID());
		/*if(str == "Red"){    //red button이라면
			f.setBackground(Color.red);
			b.setLabel("Blue");
			b.setBackground(Color.blue);
			b.setForeground(Color.red);
		}else{   //blue button이라면
			f.setBackground(Color.blue);
			b.setLabel("Red");
			b.setBackground(Color.red);
			b.setForeground(Color.blue);
		}*/
	}
	public static void main(String[] args) {
		new ToggleButton().go();
	}
}

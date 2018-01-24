import java.awt.*;
import java.awt.event.*;

public class ColorTest implements ActionListener{
	private Frame f;
	private Panel p;
	private TextField tfRed,tfGreen, tfBlue;
	private Button bOk;
	private Canvas  c;
	public void go(){
		f = new Frame("Color Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		tfRed = new TextField("0",10);
		tfGreen = new TextField("0",10);
		tfBlue = new TextField("0",10);
		bOk = new Button("확인");
		bOk.addActionListener(this);
		c = new Canvas();
		c.setBackground(Color.black);
		p.setLayout(new GridLayout(3,2));
		p.add(new Label("Red : "));
		p.add(tfRed);
		p.add(new Label("Green : "));
		p.add(tfGreen);
		p.add(new Label("Blue : "));
		p.add(tfBlue);

		f.add(p, "North");
		f.add(c, "Center");
		f.add(bOk, "South");
		f.setSize(200, 300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		int red = Integer.parseInt(tfRed.getText().trim());
		int green = Integer.parseInt(tfGreen.getText().trim());
		int blue = Integer.parseInt(tfBlue.getText().trim());
		c.setBackground(new Color(red, green, blue));
	}
	public static void main(String[] args) {
		new ColorTest().go();	
	}
}

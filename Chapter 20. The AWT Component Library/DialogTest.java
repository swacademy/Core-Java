import java.awt.*;
import java.awt.event.*;

class DialogTest implements ActionListener{
	private Frame f;
	private Button bOpen, bClose;
	private Dialog d;
	public void go(){
		f = new Frame("Dialog Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		bOpen = new Button("Open");
		bOpen.addActionListener(this);
		bClose = new Button("Close");
		bClose.addActionListener(this);
		f.add(bOpen, "South");
		f.setSize(300,300);
		f.setVisible(true);
		/////////////////여기서부터는 dialig 디자인하기///////////////////////
		d = new Dialog(f, "This is a Dialog", true);
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				d.setVisible(false);	
			}
		});
		d.setLayout(new GridLayout(2,1));
		d.add(new Label("I'm a Dialog"));
		d.add(bClose);
		d.setSize(100,100);
	}
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if(str=="Open"){
			d.setVisible(true);
			//d.show();
		}else if(str=="Close"){
			d.setVisible(false);
			//d.hide();
		}
	}
	public static void main(String[] args) {
		new DialogTest().go();	
	}
}
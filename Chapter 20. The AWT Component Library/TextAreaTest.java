import java.awt.*;
import java.awt.event.*;   

public class TextAreaTest implements ActionListener{
	private Frame f;
	private TextArea  ta;
	private TextField tf;
	private Panel p;
	private Button bOk;
	public void go(){
		f = new Frame("TextArea Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		//Scrollbars's int값 
		//0:both,   1:vertical_only,   2: horizontal_only    3:none
		ta = new TextArea("--Chatting Contents--", 15, 30, 3);
		p = new Panel();
		tf = new TextField(23);
		tf.addActionListener(this);   
		bOk = new Button("확인");
		bOk.transferFocusBackward();
		bOk.addActionListener(this);   
		p.add(tf);
		p.add(bOk);
		f.add(ta, "Center");
		f.add(p, "South");
		f.pack();
		f.setResizable(false);  //size조절 금지
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){   
		String str = tf.getText().trim();
		ta.append("\n" + str);
		tf.setText("");
	}
	public static void main(String[] args) {
		new TextAreaTest().go();
	}
}

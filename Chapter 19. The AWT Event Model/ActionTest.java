import java.awt.*;
import java.awt.event.*;		// 1. import 하자

// 4. 해당 Interface implements 하자
public class ActionTest implements ActionListener{
	private Frame f;
	private Button b1;
	public void go() {
		f = new Frame("ActionTest");
		b1 = new Button("Press Me!");
		// 2. Event Listener를 해당 컴포넌트에 등록하자.
		b1.addActionListener(this);
		f.add(b1);
		f.setSize(200,200);
		f.setVisible(true);
	}
	// 3. Event Handler 구현하자..  Interface 이므로  
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action 발생했음");
		System.out.println("Button's Label : " + e.getActionCommand());
	}
	public static void main(String[] args) 	{
		new ActionTest().go();	
	}
}

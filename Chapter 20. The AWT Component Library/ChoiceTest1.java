import java.awt.*;
import java.awt.event.*;

public class ChoiceTest1 implements ItemListener{
	private Frame f;
	private Choice chColor;
	public void go(){
		f = new Frame("칼라선택 창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		chColor = new Choice();
		chColor.addItemListener(this);  //2. 
		chColor.add("==칼라선택==");
		chColor.add("빨강");
		chColor.add("노랑");
		chColor.add("파랑");
		chColor.add("주황");
		f.add(chColor,"South");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		Color [] array = {Color.red, Color.yellow, Color.blue, Color.orange};
		int idx = chColor.getSelectedIndex();
		if(idx !=0){
			f.setBackground(array[idx-1]);
		}
	}
	public static void main(String[] args) {
		new ChoiceTest1().go();	
	}
}

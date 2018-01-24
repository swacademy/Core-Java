import java.awt.*;
import java.awt.event.*; 

public class RadioButtonTest implements ItemListener{
	private Frame f;
	private Panel p;
	private Checkbox cbMale, cbFemale;
	private CheckboxGroup  cbg;
	private TextField tf;
	public void go(){
		f = new Frame("RadioButtonTest");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		cbg = new CheckboxGroup();
		cbFemale = new Checkbox("여자", cbg, false);
		cbFemale.addItemListener(this);  //2. 등록하자.
		cbMale = new Checkbox("남자", cbg, false);
		cbMale.addItemListener(this);
		tf = new TextField();
		p.add(cbFemale);  p.add(cbMale);
		f.add(p, "North");
		f.add(tf, "South");
		f.setSize(200,200);
		f.setVisible(true);
	}
	//3. step Event Handler Method Overriding하자.
	public void itemStateChanged(ItemEvent e){
		tf.setText(e.getItem() + "가 선택됐습니다");
	}
	public static void main(String[] args) {
		new RadioButtonTest().go();	
	}
}

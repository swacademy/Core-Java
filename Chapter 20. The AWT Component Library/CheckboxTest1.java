import java.awt.*;
import java.awt.event.*;

public class CheckboxTest1 implements ActionListener{
	private Frame f;
	private Panel p, p1;
	private Button bOk;
	private Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	private TextField tf;
	public void go(){
		f = new Frame("취미 선택창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();   //윗 패널
		p1 = new Panel();  //center panel
		bOk = new Button("확인");
		bOk.addActionListener(this);
		cb1 = new Checkbox("독서");
		cb2 = new Checkbox("뜨게질");
		cb3 = new Checkbox("꽃꽂이");
		cb4 = new Checkbox("음악감상");
		cb5 = new Checkbox("영화감상");
		cb6 = new Checkbox("십자수");
		tf  = new TextField();
		p.setLayout(new GridLayout(1,2));
		p.add(new Label("당신의 취미는?"));
		p.add(bOk);

		p1.setLayout(new GridLayout(3,2));
		p1.add(cb1);     p1.add(cb2);     p1.add(cb3);
		p1.add(cb4);     p1.add(cb5);     p1.add(cb6);

		f.add(p, "North");
		f.add(p1, "Center");
		f.add(tf, "South");
		f.pack();
		f.setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
		String str = "당신의 취미는 ";
		if(cb1.getState() == true)  str += cb1.getLabel() + ",";
		if(cb2.getState() == true)  str += cb2.getLabel() + ",";
		if(cb3.getState() == true)  str += cb3.getLabel() + ",";
		if(cb4.getState() == true)  str += cb4.getLabel() + ",";
		if(cb5.getState() == true)  str += cb5.getLabel() + ",";
		if(cb6.getState() == true)  str += cb6.getLabel() + ",";
		str = str.substring(0,str.length()-1);
		tf.setText(str);
		System.out.println(str.length());
	}
	public static void main(String[] args) {
		new CheckboxTest1().go();
	}
}

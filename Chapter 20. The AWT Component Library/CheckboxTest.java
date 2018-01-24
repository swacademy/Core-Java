import java.awt.*;
import java.awt.event.*;
public class  CheckboxTest implements ItemListener{
	private Frame  f;
	private Panel p;
	private Checkbox  cb1,  cb2, cb3;
	public void go(){
		f = new Frame("Checkbox Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		cb1 = new Checkbox("one");
		cb1.addItemListener(this);  //2.event 등록하자.
		cb2 = new Checkbox("two");
		cb2.addItemListener(this);
		cb3 = new Checkbox("three", true);
		cb3.addItemListener(this);
		p.add(cb1);  p.add(cb2);   p.add(cb3);
		f.add(p, "North");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){   //체크됐다면
			System.out.println(e.getItem() + "이 선택됐습니다");
		}else{   //체크해제됐다면
			System.out.println(e.getItem() + "이 해제됐습니다");
		}
	}
	public static void main(String[] args) {
		new CheckboxTest().go();
	}
}

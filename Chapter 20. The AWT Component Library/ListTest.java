import java.awt.*;
import java.awt.event.*;

public class ListTest implements ItemListener{
	private Frame f;
	private List  lstSunsu;
	private TextField tf;
	public void go(){
		f = new Frame("좋아하는 선수 고르기");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		lstSunsu = new List(4, true);   //4개 보여주고,여러명 선택가능
		lstSunsu.addItemListener(this);  //2. step
		lstSunsu.add("==선수선택==");
		lstSunsu.add("조오련");
		lstSunsu.add("박찬호");
		lstSunsu.add("박세리");
		lstSunsu.add("안정환");
		lstSunsu.add("이천수");
		lstSunsu.add("이영표");
		lstSunsu.add("차범근");
		lstSunsu.add("김남일");
		lstSunsu.add("차두리");
		tf = new TextField();
		f.add(new Label("좋아하는 선수를 여러명 선택하세요"), "North");
		f.add(lstSunsu, "Center");
		f.add(tf, "South");
		f.setSize(200, 300);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		String sunsu = "내가 좋아하는 선수는 ";
		String [] array = lstSunsu.getSelectedItems();
		for(int i=0;i<array.length;i++){
			//tf.setText(array[i] + ", ");
			sunsu +=array[i] + ",";
		}
		tf.setText(sunsu);
	}
	public static void main(String[] args) {
		new ListTest().go();	
	}
}

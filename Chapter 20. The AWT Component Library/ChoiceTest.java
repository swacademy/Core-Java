import java.awt.*;
import java.awt.event.*; 

public class ChoiceTest implements ItemListener{
	private Frame f;
	private Choice chJob;
	private TextField tf;
	public void go(){
		f = new Frame("직업선택 창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		chJob = new Choice();
		chJob.addItemListener(this);  
		chJob.add("==직업선택==");
		chJob.add("회사원");
		chJob.add("공무원");
		chJob.add("학생");
		chJob.add("전업주부");
		chJob.add("프로그래머");
		chJob.add("운전기사");
		chJob.add("무직");
		tf = new TextField();
		f.add(new Label("당신의 직업을 선택하세요"), "North");
		f.add(chJob, "Center");
		f.add(tf, "South");
		f.setSize(150, 150);
		f.setVisible(true);

	}
	public void itemStateChanged(ItemEvent e){  
		String str = "당신의 직업은 ";
		String job = chJob.getSelectedItem();
		if(chJob.getSelectedIndex() != 0){
			tf.setText(str + job + " 이군요");	
		}else{
			tf.setText("다시 선택해 주세요");
		}
	}
	public static void main(String[] args) {
		new ChoiceTest().go();	
	}
}

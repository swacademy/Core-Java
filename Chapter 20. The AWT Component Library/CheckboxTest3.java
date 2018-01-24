//기타를 체크하면 다이얼로그 보이기
import java.awt.*;
import java.awt.event.*;

public class CheckboxTest3 implements ItemListener, ActionListener{
	private Frame f;
	private Dialog d;
	private Panel p,p1;
	private Button bOk, bClose;
	private TextField tfGita;
	private Checkbox cb1, cb2, cb3, cb4,cb5, cb6;
	public void go(){
		f = new Frame("취미 선택 창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		p = new Panel();    //윗패널
		p1 = new Panel();   //가운데 패널
		bOk = new Button("확인");
		bOk.addActionListener(this);
		tfGita = new TextField();
		//tfGita.setEditable(false);   //edit 못하게
		cb1 = new Checkbox("뜨게질");
		cb1.addItemListener(this);
		cb2 = new Checkbox("독서");
		cb2.addItemListener(this);
		cb3 = new Checkbox("컴퓨터하기");
		cb3.addItemListener(this);
		cb4 = new Checkbox("운동");
		cb4.addItemListener(this);
		cb5 = new Checkbox("등산");
		cb5.addItemListener(this);
		cb6 = new Checkbox("기타");
		cb6.addItemListener(this);

		p.setLayout(new GridLayout(1,2));
		p.add(new Label("당신의 취미는?"));
		p.add(bOk);

		p1.setLayout(new GridLayout(3,2));
		p1.add(cb1);  p1.add(cb2);    p1.add(cb3);
		p1.add(cb4);  p1.add(cb5);    p1.add(cb6);

		f.add(p, "North");
		f.add(p1, "Center");
		f.setSize(200, 300);
		f.setVisible(true);
		//////////////////////////////Dialog Design////////////////////////////////////
		d = new Dialog(f, "추가 입력 창", true);
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//d.hide();   //dialog 숨기기    
				d.setVisible(false);
			}
		});
		d.add(tfGita, "Center");
		bClose = new Button("닫기");
		bClose.addActionListener(this);
		d.add(bClose, "South");
		d.pack();
		d.setBackground(Color.pink);
	}
	public void actionPerformed(ActionEvent e){
		String habit = "당신의 취미는 ";
		if(!e.getSource().equals(bClose)){   //확인버튼을 눌렀다면
			if(cb1.getState() == true)	habit += cb1.getLabel() + ",";	
			if(cb2.getState() == true)	habit += cb2.getLabel() + ",";
			if(cb3.getState() == true)	habit += cb3.getLabel() + ",";
			if(cb4.getState() == true)	habit += cb4.getLabel() + ",";
			if(cb5.getState() == true)	habit += cb5.getLabel() + ",";
			if(tfGita.getText().trim() != "")	habit += tfGita.getText().trim() + ",";
			habit = habit.substring(0,habit.length()-1);
			System.out.println(habit + " 이군요");
		}else{   //닫기버튼을 눌렀다면
			//d.hide();   //dialog 닫기
			d.setVisible(false);
			cb6.setState(false);
		}
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource().equals(cb6)){   //기타가 선택됐다면
			if(cb6.getState() == true){  //체크했다면
				//d.show();     //dialog 보이기
				d.setVisible(true);
			}else{   //기타항목이 체크해제됐다면
				//d.hide();             //감추기
				d.setVisible(false);
			}
		}
	}

	public static void main(String[] args) {
		new CheckboxTest3().go();	
	}
}

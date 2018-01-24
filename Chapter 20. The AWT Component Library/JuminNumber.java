import java.awt.*;
import java.awt.event.*;  

public class JuminNumber implements FocusListener{
	private Frame f;
	private Label lbText, lbHypen;
	private Panel p, p1, p2;
	private TextField tfJumin1,tfJumin2, tfResult;
	private CheckboxGroup cbg;
	private Checkbox cbMale, cbFemale;
	public void go(){
		f = new Frame("주민번호 체크 창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();  //center panel
		p1 = new Panel();  //center's 윗패널
		p2 = new Panel();   //center's 아랫패널
		lbText = new Label("주민등록번호를 입력해 주세요");
		lbHypen = new Label("－", Label.CENTER);
		tfJumin1 = new TextField(6);
		tfJumin1.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				if(tfJumin1.getText().length() == 6){
					tfJumin1.transferFocus();
				}
			}
		});
		tfJumin2 = new TextField(7);
		tfJumin2.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				if(tfJumin2.getText().length() == 7){
					tfJumin2.transferFocus();
				}
			}
		});
		tfJumin2.addFocusListener(this);   
		tfResult = new TextField();
		cbg = new CheckboxGroup();
		cbFemale = new Checkbox("여자", cbg, false);
		cbMale = new Checkbox("남자", cbg, false);
		p.setLayout(new GridLayout(2,1));
		p1.add(tfJumin1);   p1.add(lbHypen);
		p1.add(tfJumin2);
		p2.add(cbFemale);   p2.add(cbMale);
		p.add(p1);   p.add(p2);
		f.add(lbText, "North");
		f.add(p, "Center");
		f.add(tfResult, "South");
		f.setSize(200,150);
		f.setVisible(true);
	}
	public void focusLost(FocusEvent e){ 
		String jumin = tfJumin2.getText().trim();
		if(jumin.charAt(0) == '1' || jumin.charAt(0) == '3'){  //남자라면
			cbMale.setState(true);
		}else if(jumin.charAt(0) == '2' || jumin.charAt(0) == '4'){  //여자라면
			cbFemale.setState(true);
		}
		checkJumin();
	}
	public void checkJumin(){
		String jumin = tfJumin1.getText() + tfJumin2.getText();
		int [] intArray = new int[13];
		for(int i=0;i<13;i++){
			String s = jumin.substring(i,i+1);
			intArray[i] = Integer.parseInt(s);
		}
		int [] temp = new int[13];
		int gop = 2;
		for(int i=0;i<12;i++){
			temp[i] = intArray[i] * gop;
			gop++;
			if(gop==10) gop=2;
		}
		int total = 0;
		for(int i=0;i<12;i++){
			total += temp[i];
		}
		int mod = 0;
		mod = total % 11;
		mod = 11- mod;
		if((mod % 10) == intArray[12]) tfResult.setText("제대로 입력하셨습니다");
		else tfResult.setText("다시 입력해 주세요");
	}
	public void focusGained(FocusEvent e){}
	public static void main(String[] args) {
		new JuminNumber().go();
	}
}

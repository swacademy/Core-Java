//advantage
/*
	1. Focus
	2. TextField에 actionevent 달기
	3. 사용자 정의 ColorException을 사용해서 0부터 255까지만 입력가능

*/
import java.awt.*;
import java.awt.event.*;  

public class ColorTest1 implements ActionListener, FocusListener{
	private Frame f;
	private Panel p,p1;
	private TextField tfRed,tfGreen, tfBlue;
	private Button bOk;
	private Label rLabel, gLabel, bLabel, errorLabel;
	private Canvas  c;
	public void go(){
		f = new Frame("Color Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		p1 = new Panel();
		errorLabel = new Label("숫자 0부터 255까지 입력해 주세요");
		tfRed = new TextField("0",10);
		tfRed.addFocusListener(this);
		tfRed.addActionListener(this);
		tfGreen = new TextField("0",10);
		tfGreen.addActionListener(this);
		tfGreen.addFocusListener(this);
		tfBlue = new TextField("0",10);
		tfBlue.addActionListener(this);
		tfBlue.addFocusListener(this);  //2. 

		bOk = new Button("확인");
		bOk.addActionListener(this);
		p1.setLayout(new GridLayout(2,1));
		p1.add(bOk);
		p1.add(errorLabel);
		c = new Canvas();
		c.setBackground(Color.black);
		p.setLayout(new GridLayout(3,2));
		p.add(rLabel = new Label("Red : 0"));
		rLabel.setBackground(Color.red);
		p.add(tfRed);
		p.add(gLabel = new Label("Green : 0"));
		gLabel.setBackground(Color.green);
		p.add(tfGreen);
		p.add(bLabel = new Label("Blue : 0"));
		bLabel.setBackground(Color.blue);
		p.add(tfBlue);

		f.add(p, "North");
		f.add(c, "Center");
		f.add(p1, "South");
		f.setSize(200, 300);
		f.setVisible(true);
	}
	//3. 
	public void focusGained(FocusEvent e){   //포커스를 얻었을 때
		//bOk.setLabel("확인");
		Object obj = e.getSource();
		if(obj.equals(tfRed)){   //event source가 red textfiled일때
			tfRed.setText("");
			rLabel.setText("Red : ");
		}else if(obj.equals(tfGreen)){  //event source가 green textfiled일때
			tfGreen.setText("");
			gLabel.setText("Green : ");
		}else if(obj.equals(tfBlue)){  //event source가 blue textfiled일때
			tfBlue.setText("");
			bLabel.setText("Blue : ");
		}
	}
	public void focusLost(FocusEvent e){   //포커스를 잃었을 때
		Object obj = e.getSource();
		if(obj.equals(tfRed)){   //event source가 red textfiled일때
			if(tfRed.getText().trim().equals("")){   //red textfield에 값이 없고, 글자가 들어있다면
				tfRed.setText("0");
				rLabel.setText("Red : 0");
			}else{   //값이 있다면
				rLabel.setText("Red : " + tfRed.getText().trim());
			}
		}else if(obj.equals(tfGreen)){  //event source가 green textfiled일때
			if(tfGreen.getText().trim().equals("")){  // green textfield의 값이 없다면
				tfGreen.setText("0");
				gLabel.setText("Green : 0");
			}else{   //값이 있다면
				gLabel.setText("Green : " + tfGreen.getText().trim());
			}
		}else if(obj.equals(tfBlue)){  //event source가 blue textfiled일때
			if(tfBlue.getText().trim().equals("")){   //blue textfield의 값이 없다면
				tfBlue.setText("0");
				bLabel.setText("Blue : 0");
			}else{   //값이 있다면
				bLabel.setText("Blue : " + tfBlue.getText().trim());
			}
		}
	}
	public void actionPerformed(ActionEvent e){
		try{
			int red = Integer.parseInt(tfRed.getText().trim());
			int green = Integer.parseInt(tfGreen.getText().trim());
			int blue = Integer.parseInt(tfBlue.getText().trim());
			checkNumber(red, green,blue);
			c.setBackground(new Color(red, green, blue));
		}catch(NumberFormatException ex){
			//System.out.println("숫자를 입력하셔야 합니다");
			//if((e.getSource()).equals(bOk) ==  false){
			//	((TextField)e.getSource()).setText("숫자를 입력하셔야 합니다");
			//}else{
			//	bOk.setLabel(ex.getMessage());
			//}
			errorLabel.setText("숫자를 입력하셔야 합니다");
			((TextField)e.getSource()).setText("0");
		}catch(ColorException ex){
			//if((e.getSource()).equals(bOk) ==  false){
			//	((TextField)e.getSource()).setText(ex.getMessage());
			//}else{
			//	bOk.setLabel(ex.getMessage());
			//}
			errorLabel.setText(ex.getMessage());
			((TextField)e.getSource()).setText("0");
		}
	}
	public void checkNumber(int r, int g, int b) throws ColorException{
		if(r<0 || r>255 || g<0|| g>255 || b<0 || b>255){
			throw new ColorException("0부터 255까지여야 합니다");
		}
	}
	public static void main(String[] args) {
		new ColorTest1().go();	
	}
}

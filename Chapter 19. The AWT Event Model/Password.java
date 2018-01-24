import java.awt.*;
import java.awt.event.*;

public class  Password implements FocusListener, ActionListener{
	private String password = "123456";
	private Frame f;
	private Panel p, p1;
	private Button bOk, bCancel;
	private TextField tfId, tfPwd;
	private Label lbText;

	public void go(){
		f = new Frame("Login Window");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		p1 = new Panel();
		bOk = new Button("확인");
		bOk.addActionListener(this);
		bCancel = new Button("취소");
		bCancel.addActionListener(this);
		tfId = new TextField("Enter  your ID");
		tfId.addFocusListener(this);
		tfPwd = new TextField("Enter your Password");
		tfPwd.setEchoChar('#');
		tfPwd.addActionListener(this);
		tfPwd.addFocusListener(this);
		lbText = new Label("Please Login...");

		p.setLayout(new GridLayout(2,2));  //center panel
		p.add(new Label("ID:", Label.CENTER));
		p.add(tfId);
		p.add(new Label("PWD:", Label.CENTER));
		p.add(tfPwd);

		p1.add(bOk);      //South Panel
		p1.add(bCancel);

		f.add(lbText, "North");
		f.add(p, "Center");
		f.add(p1, "South");

		f.pack();
		f.setVisible(true);
	}
	public void focusGained(FocusEvent e){
		if(e.getSource() == tfId){  //id textfield에서 이벤트가 발생했다면
			tfId.setText("");
		}else if(e.getSource() == tfPwd){   //pwd textfield에서 이벤트가 발생했다면
			tfPwd.setText("");
		}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "확인"){   //확인버튼을 눌렀다면
			if(tfPwd.getText().trim().equals(password)){   //패스워드가 일치한다면
				lbText.setText(tfId.getText().trim() + "님! 로그인 성공");
			}else{   //일치하지 않는다면
				lbText.setText(tfId.getText().trim() + "님! 로그인 실패");
			}
		}else if(e.getActionCommand() == "취소"){   //취소버튼을 눌렀다면
			tfId.setText("");
			tfPwd.setText("");
		}else{   //TextField이벤트가 발생할 때
			if(tfPwd.getText().trim().equals(password)){   //패스워드가 일치한다면
				lbText.setText(tfId.getText().trim() + "님! 로그인 성공");
			}else{   //일치하지 않는다면
				lbText.setText(tfId.getText().trim() + "님! 로그인 실패");
			}
		}
	}
	public void focusLost(FocusEvent e){}
	public static void main(String[] args) {
		new Password().go();
	}
}

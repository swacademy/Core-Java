import java.awt.*;
import java.awt.event.*;

class DialogTest1 implements ActionListener{
	private Frame f;
	private Button bOpen, bSave;
	private FileDialog  fdOpen, fdSave;
	public void go(){
		f = new Frame("This is a FileDialog Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);    //종료하기
			}
		});
		f.setLayout(new FlowLayout());
		bOpen = new Button("Open");
		bOpen.addActionListener(this);
		bSave = new Button("Save");
		bSave.addActionListener(this);
		//열기 다이얼로그 박스만들기
		fdOpen = new FileDialog(f, "I'm a Open Dialog", FileDialog.LOAD);
		//저장 다이얼로그 박스 만들기
		fdSave = new FileDialog(f, "I'm a Save Dialog", FileDialog.SAVE);
		f.add(bOpen);
		f.add(bSave);
		f.setSize(200,200);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "Open"){    //open버튼을 눌렀다면
			fdOpen.setVisible(true);
			System.out.println(fdOpen.getDirectory() + fdOpen.getFile());
		}else{     //save버튼을 눌렀다면
			fdSave.setVisible(true);
			System.out.println(fdSave.getDirectory() + fdSave.getFile());
		}
	}
	public static void main(String[] args) {
		new DialogTest1().go();	
	}
}
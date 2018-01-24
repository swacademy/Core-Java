import java.awt.*;
import java.awt.event.*;

public class BeforeConvert implements ActionListener{
	private Frame f;
	private TextArea ta;
	private MenuBar mb;
	private Menu mFile;
	private MenuItem miNew, miOpen, miSave, miExit;
	private FileDialog  fdOpen, fdSave;
	private int fileNumber=2;
	public void go(){
		f = new Frame("TextEditor - [Noname1]");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);    //종료
			}
		});

		//Dialog Design
		fdOpen = new FileDialog(f, "열기 대화 상자", FileDialog.LOAD);
		fdSave = new FileDialog(f, "저장 대화 상자", FileDialog.SAVE);

		ta = new TextArea();
		ta.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				miSave.setEnabled(true);  //TextArea에서 Key를 눌렀다 띄면 저장메뉴 활성화
			}
		});
		//MenuItem 생성
		miNew = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
		miNew.addActionListener(this);
		miOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
		miOpen.addActionListener(this);
		miSave = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
		miSave.setEnabled(false);             //save menuitem 비활성화
		miSave.addActionListener(this);
		miExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_X));
		miExit.addActionListener(this);
		
		//Menu 생성
		mFile = new Menu("File");
		//Menu에 MenuItem 붙이기
		mFile.add(miNew);             mFile.add(miOpen);                mFile.add(miSave);
		mFile.addSeparator();        mFile.add(miExit);

		//MenuBar 생성
		mb = new MenuBar();
		//MenuBar에 Menu붙이기
		mb.add(mFile);

		//Frame에 MenuBar 붙이기
		f.setMenuBar(mb);
		f.add(ta);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(miNew)){    //new menuitem을 눌렀다면
			newCommand();
		}else if(e.getSource().equals(miOpen)){   //open menuitem을 눌렀다면
			openCommand();
		}else if(e.getSource().equals(miSave)){    //save menuitem을 눌렀다면
			saveCommand();
		}else if(e.getSource().equals(miExit)){      //exit menuitem을 눌렀다면
			exitCommand();
		}
	}
	public void newCommand(){
		ta.setText("");
		miSave.setEnabled(false);
		f.setTitle("TextEditor - [Noname" + fileNumber++ + "]");
	}
	public void openCommand(){
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory() + fdOpen.getFile();
		ta.setText("");
		f.setTitle("TextEditor - [" + path + "]");
	}
	public void saveCommand(){
		fdSave.setVisible(true);
		String path = fdSave.getDirectory() + fdSave.getFile(); 
		f.setTitle("TextEditor - [" + path + "]");
	}
	public void exitCommand(){  //종료하기
		System.exit(0);
	}
	public static void main(String[] args) {
		new BeforeConvert().go();	
	}
}

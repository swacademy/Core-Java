import java.awt.*;
import java.awt.event.*;
import javax.swing.*;      //1. import 하자.
//2. 각 컴포넌트에 J자를  접두사로  붙이자.
public class AfterConvert implements ActionListener{
	private JFrame f;
	private JTextArea ta;
	private JMenuBar mb;
	private JMenu mFile;
	private JMenuItem miNew, miOpen, miSave, miExit;
	private FileDialog  fdOpen, fdSave;
	private int fileNumber=2;
	private JToolBar toolbar;
	private JButton btnOpen, btnNew, btnSave;
	public void go(){
		f = new JFrame("TextEditor - [Noname1]");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);    //종료
			}
		});

	////////////////////  ToolBar Design  ////////////////////////////////////
		toolbar = new JToolBar(JToolBar.VERTICAL);
		toolbar.add(btnNew = new JButton(new ImageIcon("new.gif")));
		btnNew.addActionListener(this);
		toolbar.add(btnOpen = new JButton(new ImageIcon("open.gif")));
		btnOpen.addActionListener(this);
		toolbar.add(btnSave = new JButton(new ImageIcon("save.gif")));
		btnSave.addActionListener(this);
		f.getContentPane().add(toolbar, "South");
		//Dialog Design
		fdOpen = new FileDialog(f, "열기 대화 상자", FileDialog.LOAD);
		fdSave = new FileDialog(f, "저장 대화 상자", FileDialog.SAVE);

		ta = new JTextArea();
		ta.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				miSave.setEnabled(true);  //TextArea에서 Key를 눌렀다 띄면 저장메뉴 활성화
			}
		});
		//MenuItem 생성
		miNew = new JMenuItem("New", new ImageIcon("new.gif"));
		miNew.setMnemonic(KeyEvent.VK_N);
		miNew.addActionListener(this);
		miOpen = new JMenuItem("Open", new ImageIcon("open.gif"));
		miOpen.setMnemonic(KeyEvent.VK_O);
		miOpen.addActionListener(this);
		miSave = new JMenuItem("Save", new ImageIcon("save.gif"));
		miSave.setMnemonic(KeyEvent.VK_S);
		miSave.setEnabled(false);             //save menuitem 비활성화
		miSave.addActionListener(this);
		miExit = new JMenuItem("Exit");
		miExit.addActionListener(this);
		
		//Menu 생성
		mFile = new JMenu("File");
		//Menu에 MenuItem 붙이기
		mFile.add(miNew);             mFile.add(miOpen);                mFile.add(miSave);
		mFile.addSeparator();        mFile.add(miExit);

		//MenuBar 생성
		mb = new JMenuBar();
		//MenuBar에 Menu붙이기
		mb.add(mFile);

		//Frame에 MenuBar 붙이기
		f.setJMenuBar(mb);
		//f.add(ta);
		f.getContentPane().add(ta);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(miNew) | e.getSource().equals(btnNew)){    //new menuitem을 눌렀다면
			newCommand();
		}else if(e.getSource().equals(miOpen) | e.getSource().equals(btnOpen)){   //open menuitem을 눌렀다면
			openCommand();
		}else if(e.getSource().equals(miSave) | e.getSource().equals(btnSave)){    //save menuitem을 눌렀다면
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
		new AfterConvert().go();	
	}
}

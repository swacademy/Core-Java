import java.awt.*;
import java.awt.event.*;  

public class MenuTest implements ActionListener{
	private Frame f;
	private TextArea ta;
	private FileDialog fdOpen, fdSave;
	private MenuBar mb;
	private Menu mFile, mHelp,mColor,mBack, mFore;
	private MenuItem miNew,  miOpen,miSave, miExit, miAbout;
	private MenuItem miRed, miBlue, miYellow, miCyan;
	private CheckboxMenuItem  cbmiMale, cbmiFemale;
	public void go(){
		f = new Frame("Menu Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);   //Frame 종료
			}
		});
		fdOpen = new FileDialog(f, "나는 열기 대화 상자", FileDialog.LOAD);
		fdSave = new FileDialog(f, "나는 저장 대화 상자", FileDialog.SAVE);
		mb = new MenuBar();

		mFile = new Menu("File(F)");
		mHelp = new Menu("Help(H)");
		mColor = new Menu("Color(C)");
		mBack = new Menu("Back Color");   //배경색
		mFore = new Menu("Fore Color");   //전경색

		miNew = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
		miNew.addActionListener(this);  //2. 
		miOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
		miOpen.addActionListener(this);
		miSave = new MenuItem("Save As...", new MenuShortcut(KeyEvent.VK_S));
		miSave.addActionListener(this);
		miSave.setEnabled(false);    //저장메뉴 비 활성화

		miExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_E));
		miExit.addActionListener(this);
		miAbout = new MenuItem("About JoyTech...");
		miAbout.addActionListener(this);

		miRed = new MenuItem("Red", new MenuShortcut(KeyEvent.VK_R));
		miRed.addActionListener(this);
		miBlue = new MenuItem("Blue", new MenuShortcut(KeyEvent.VK_B));
		miBlue.addActionListener(this);
		miYellow = new MenuItem("Yellow", new MenuShortcut(KeyEvent.VK_Y));
		miYellow.addActionListener(this);
		miCyan = new MenuItem("Cyan", new MenuShortcut(KeyEvent.VK_C));
		miCyan.addActionListener(this);

		mBack.add(miYellow);  mBack.add(miCyan);
		mFore.add(miRed);      mFore.add(miBlue);

		mColor.add(mBack);   //mBack은 SubMenu임
		mColor.add(mFore);
		cbmiMale = new CheckboxMenuItem("남자", false);
		cbmiFemale = new CheckboxMenuItem("여자", true);
		mColor.add(cbmiMale);
		mColor.add(cbmiFemale);

		////////    Menu에 MenuItem붙이기   //////////////////////////
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.addSeparator();   //구분선
		mFile.add(miExit);

		mHelp.add(miAbout);

		mb.add(mFile);
		mb.add(mColor);
		mb.setHelpMenu(mHelp);
		ta = new TextArea();
		ta.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){
				if(ta.getText().length() > 0){   //글자가 한개이상 있으면
					miSave.setEnabled(true);
				}
			}
		});
		f.add(ta);
		f.setMenuBar(mb);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){   
		String str = e.getActionCommand();
		if(str == "New"){     //새창띄우기
			ta.setText("");
			miSave.setEnabled(false);
			ta.setBackground(Color.white);
			ta.setForeground(Color.black);
		}else if(str == "Open"){   //열기
			fdOpen.setVisible(true);
			//String directory = fdOpen.getDirectory();
			//String file = fdOpen.getFile();
			ta.setText(fdOpen.getDirectory() + fdOpen.getFile());
 		}else if(str == "Save As..."){     //저장하기
			fdSave.setVisible(true);
			ta.setText(fdSave.getDirectory() + fdSave.getFile());
		}else if(str == "Exit"){    //종료하기
			System.exit(0);   //종료
		}else if(str == "About JotTech..."){   //도움말보기

		}else if(str =="Red"){
			ta.setForeground(Color.red);
		}else if(str =="Blue"){
			ta.setForeground(Color.blue);
		}else if(str =="Yellow"){
			ta.setBackground(Color.yellow);
		}else if(str =="Cyan"){
			ta.setBackground(Color.cyan);
		}
	}
	public static void main(String[] args) {
		new MenuTest().go();	
	}
}

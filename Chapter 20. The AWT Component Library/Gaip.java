import java.awt.*;
import java.awt.event.*;

public class Gaip implements ActionListener, FocusListener{
	private Frame f;
	private ScrollPane  sp;
	private String userID;
	private boolean isOk = false;
	private Panel p, pMain, pSouth, p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16;
	private Panel pIDJungbok;
	private Label lbIDInfo, lbUserInfo, lbID, lbIDCheck, lbPwd,lbPwd1,lbName, lbJuminNumber, lbGender;
	private Label lbBirthday, lbYear, lbMonth, lbDay, lbZip, lbAddr1, lbAddr2, lbTel, lbHp, lbJob, lbHabit;
	private Label lbJumin;
	private Choice lstYear, lstMonth, lstDay, lstHp, lstJob;
	private TextField tfID, tfPwd,tfPwd1,tfName, tfJumin1, tfJumin2, tfZip1, tfZip2, tfZip;
	private TextField tfAddr1, tfAddr2,tfTel1, tfTel2, tfTel3, tfHp1, tfHp2,tfIDJungbok;
	private Button btnPrint, btnExit, btnIDJungbok, btnZip,  btnIDClose;
	private Button btnPwdClose, btnZipClose, btnJuminClose, btnErrorClose, btnGaipClose;
	private CheckboxGroup cbgGender;
	private Checkbox  cbFemale, cbMale, cbGita, cbReading, cbBaduk, cbGame,cbMusic, cbVideo, cbFlower;
	private Dialog  dIDCheck, dPwdCheck, dZip, dJuminCheck, dError, dGaip;
	public void go(){
		f = new Frame("JoyTech Company 회원 가입 창");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);   //Frame 종료
			}
		});
		//항상 수평과 수직 ScrollBar가 있는 ScrollPane생성
		sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);  
		//ScrollPane에 담을 Panel생성
		p = new Panel();
		p.setLayout(new BorderLayout());
		pMain = new Panel();   //main panel, p라는 Panel의 Center에 들어갈 Panel
		pMain.setLayout(new GridLayout(16,1));   //16행 1열의 Layout생성

		/////////////////  <아이디정보>라는 글자가 위치할 Panel   ////////////////////////////
		p1 = new Panel();
		p1.setBackground(Color.black);
		p1.add(lbIDInfo = new Label("아이디 정보", Label.CENTER));
		lbIDInfo.setForeground(Color.white);
		pMain.add(p1);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////  <회원 아이디>를 입력받을 Panel   //////////////////////////////////
		p2 = new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbID = new Label("회원  아이디", Label.CENTER);
		lbID.setBackground(Color.pink);  //필수입력항목은 Label이 pink색으로 표시
		tfID = new TextField(25);
		btnIDJungbok = new Button("중복확인");
		btnIDJungbok.addActionListener(this);      //<중복확인>이라는 버튼을 눌렀을때 이벤트호출
		p2.add(lbID);   
		p2.add(tfID);   
		p2.add(btnIDJungbok);
		pMain.add(p2);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////    <아이디체크> Dialog Design         ///////////////////////////
		dIDCheck = new Dialog(f, "아이디체크 창", true);
		lbIDCheck = new Label("", Label.CENTER);
		pIDJungbok = new Panel();    //<ID:>와 TextField와 <닫기>버튼이 들어갈 Panel
		tfIDJungbok = new TextField(14);    //새로 아이디를 입력받을 TextField
		tfIDJungbok.addActionListener(this);    //새로 아이디를 입력한 후 엔터 칠 때 이벤트 호출 등록		
		btnIDClose = new Button("닫기");
		btnIDClose.addActionListener(this);    //Dialog에서 <닫기>를 눌렀을 때 이벤트호출 등록
		//앞에서 넘어온 아이디를 사용할 수 없다는 라벨 출력
		dIDCheck.add(lbIDCheck, "North");
		//Dialog속의 Panel
		pIDJungbok.add(new Label("ID:"));         	
		pIDJungbok.add(tfIDJungbok);
		pIDJungbok.add(btnIDClose);
		dIDCheck.add(pIDJungbok,"South");    //Dialog에 Panel붙이기
		dIDCheck.setSize(300, 100);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		//////////////////  비밀번호가 같지 않으면 보여주는 Dialog Design   ///////////////////
		dPwdCheck = new Dialog(f, "비밀번호확인창", false);
		btnPwdClose = new Button("비밀번호창닫기");
		btnPwdClose.addActionListener(this);
		dPwdCheck.add(new Label("비밀번호가 서로 일치하지 않습니다", Label.CENTER), "North");
		dPwdCheck.add(btnPwdClose, "South");
		dPwdCheck.setSize(250, 100);
        //////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////    <비밀번호>를 입력받을 Panel   ///////////////////////////////
		p3 = new Panel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbPwd = new Label("비밀    번호", Label.CENTER);
		lbPwd.setBackground(Color.pink);  //비밀번호가 필수 항목이어서 라벨이 핑크색임
		tfPwd = new TextField(14);
		tfPwd.setEchoChar('*');     //TextField에 <*>찍기
		p3.add(lbPwd);   
		p3.add(tfPwd);
		pMain.add(p3);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////    <비밀번호확인>을 입력받을 Panel   ///////////////////////////////
		p4 = new Panel();
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbPwd1 = new Label("비밀번호확인", Label.CENTER);
		lbPwd1.setBackground(Color.pink);   //비밀번호확인도 필수임
		tfPwd1 = new TextField(14);
		tfPwd1.setEchoChar('*');
		tfPwd1.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent e){
				if(tfPwd.getText().trim().equals(tfPwd1.getText().trim()) == false){   //비밀번호값이 서로 다르면
					f.getToolkit().beep();  //경고음
					dPwdCheck.setVisible(true);
				}
			}
		});
		p4.add(lbPwd1);   
		p4.add(tfPwd1);
		pMain.add(p4);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////   <사용자 정보>라벨 출력 /////////////////////////////////////
		p5 = new Panel();
		p5.setBackground(Color.black);
		p5.add(lbUserInfo = new Label("사용자  정보", Label.CENTER));
		lbUserInfo.setForeground(Color.white);
		pMain.add(p5);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////

		//////////////////////   <이름> 입력받을 패널  ////////////////////////////////////////
		p6 = new Panel();
		p6.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbName = new Label("  이    름  ", Label.CENTER);
		lbName.setBackground(Color.pink);    //이름도 필수항목이어서 핑크색임
		tfName = new TextField(20);    //이름입력받을 TextField
		p6.add(lbName);   
		p6.add(tfName);
		pMain.add(p6);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////   <주민번호입력확인> Dialog Design  /////////////////////////
		dJuminCheck = new Dialog(f, "주민번호확인창", false);
		lbJumin = new Label("", Label.CENTER);
		btnJuminClose = new Button("닫기");
		btnJuminClose.addActionListener(this);  //Dialog에서 닫기 버튼을 눌렀을 때 이벤트 등록
		dJuminCheck.add(lbJumin, "North");
		dJuminCheck.add(btnJuminClose, "South");
		dJuminCheck.setSize(250, 100);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////   주민번호 입력 Panel   //////////////////////////////////////////////////
		p7 = new Panel();
		p7.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbJuminNumber = new Label("주민등록번호", Label.CENTER);
		lbJuminNumber.setBackground(Color.yellow);
		tfJumin1 = new TextField(6);
		tfJumin1.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){  //KeyBoard의 키를 눌렀다 띌때
				if(tfJumin1.getText().length() == 6){  //tfJumin1의 값의 길이가 6자리면
					tfJumin1.transferFocus();   // 다음 TextField로 포커스 이동
				}
			}
		});
		tfJumin2 = new TextField(7);
		tfJumin2.addFocusListener(this);     //주민번호2에서 포커스를 잃었을 때 발생할 이벤트 등록
		tfJumin2.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e){  //KeyBoard의 키를 눌렀다 띌때
				if(tfJumin2.getText().length() == 7){  //tfJumin2의 값의 길이가 7자리면
					tfJumin2.transferFocus();  // 다음 TextField로 포커스 이동
				}
			}
		});
		p7.add(lbJuminNumber);      	
		p7.add(tfJumin1);     
		p7.add(new Label("--", Label.CENTER));
		p7.add(tfJumin2);
		pMain.add(p7);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////  성별 자동 입력 Panel  /////////////////////////////////////////
		p8 = new Panel();
		p8.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbGender = new Label("  성    별  ", Label.CENTER);
		lbGender.setBackground(Color.yellow);
		cbgGender = new CheckboxGroup();
		cbMale = new Checkbox("남자", cbgGender, false);
		cbMale.setEnabled(false);     //남자 Radio Button 비활성화  ==> 사용자가 선택못하도록 함
		cbFemale = new Checkbox("여자", cbgGender, false);
		cbFemale.setEnabled(false);    //여자 Radio Button 비활성화
		cbGita = new Checkbox("기타", cbgGender, false);
		cbGita.setEnabled(false);   //기타 Radio Button 비활성화
		p8.add(lbGender);     
		p8.add(cbMale);     
		p8.add(cbFemale);		
		p8.add(cbGita);
		pMain.add(p8);
		//////////////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////// 생년월일 선택 Panel ///////////////////////////////////////
		p9 = new Panel();
		p9.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbBirthday = new Label("  생년월일  ", Label.CENTER);
		lbBirthday.setBackground(Color.yellow);
		lbYear = new Label(" 년 ");
		lbMonth = new Label(" 월 ");
		lbDay = new Label(" 일 ");
		lstYear = new Choice();
		lstYear.add("----");
		for(int i=1950;i<=2020;i++){   //1950 ~ 2020년까지 추가
			lstYear.add(i + "");
		}
		lstMonth = new Choice();
		lstMonth.add("----");
		for(int i=1;i<=12;i++){     // 1~12월까지 추가
			lstMonth.add(i + "");
		}
		lstDay = new Choice();
		lstDay.add("----");
		for(int i=1;i<=31;i++){       // 1~31일까지 추가
			lstDay.add(i + "");
		}
		p9.add(lbBirthday);   p9.add(lstYear);     p9.add(lbYear);     p9.add(lstMonth);
		p9.add(lbMonth);       p9.add(lstDay);      p9.add(lbDay);
		pMain.add(p9);
		///////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////////////  우편번호검색 Dialog Design  ///////////////////////
		dZip = new Dialog(f, "우편번호검색창", false);
		tfZip = new TextField(30);
		btnZipClose = new Button("닫기");
		btnZipClose.addActionListener(this);    //닫기 버튼을 누를때 발생하는 이벤트 등록
		dZip.setLayout(new FlowLayout());
		dZip.add(tfZip);
		dZip.add(btnZipClose);
		dZip.setSize(350, 100);
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////  우편번호 입력 Panel /////////////////////////////
		p10 = new Panel();
		p10.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbZip = new Label("  우편번호  ", Label.CENTER);
		lbZip.setBackground(Color.yellow);
		tfZip1 = new TextField(3);
		tfZip1.setEditable(false);    // 사용자가 직접 입력 못하게 함
		tfZip2 = new TextField(3);
		tfZip2.setEditable(false);    // 사용자가 직접 입력 못하게 함
		btnZip = new Button("우편번호찾기");
		btnZip.addActionListener(this);   //우편번호찾기 버튼을 누를때 발생하는 이벤트 등록
		p10.add(lbZip);    p10.add(tfZip1);    p10.add(new Label("--", Label.CENTER));
		p10.add(tfZip2);   p10.add(btnZip);
		pMain.add(p10);
		///////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////// 주소1 입력 Panel  ///////////////////////////////////////
		p11 = new Panel();
		p11.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbAddr1 = new Label("  주    소1  ", Label.CENTER);
		lbAddr1.setBackground(Color.yellow);
		tfAddr1 = new TextField(30);
		tfAddr1.setEditable(false);   // 사용자가 직접 입력 못하게 함
		p11.add(lbAddr1);   p11.add(tfAddr1);
		pMain.add(p11);
		//////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////  주소2 입력 Panel  //////////////////////////////////
		p12 = new Panel();
		p12.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbAddr2 = new Label("  주    소2  ", Label.CENTER);
		lbAddr2.setBackground(Color.yellow);
		tfAddr2 = new TextField(30);
		p12.add(lbAddr2);   p12.add(tfAddr2);
		pMain.add(p12);
		////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////  전화번호 입력 Panel  /////////////////////////////
		p13 = new Panel();
		p13.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbTel = new Label("  전화번호  ", Label.CENTER);
		lbTel.setBackground(Color.yellow);
		tfTel1 = new TextField(4);
		tfTel2 = new TextField(4);
		tfTel3 = new TextField(4);
		p13.add(lbTel);    p13.add(tfTel1);    p13.add(new Label("--", Label.CENTER));
		p13.add(tfTel2);   p13.add(new Label("--", Label.CENTER));   	p13.add(tfTel3);
		pMain.add(p13);
		////////////////////////////////////////////////////////////////////////////////////////////////////////

		////////////////////////   휴대폰 입력 Panel  ////////////////////////////////////////
		p14 = new Panel();
		p14.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbHp = new Label("  휴  대  폰  ", Label.CENTER);
		lbHp.setBackground(Color.yellow);
		lstHp = new Choice();
		lstHp.add("----");     lstHp.add("010");     lstHp.add("011");     lstHp.add("016");
		lstHp.add("017");   	lstHp.add("018");     lstHp.add("019");
		tfHp1 = new TextField(4);
		tfHp2 = new TextField(4);
		p14.add(lbHp);   p14.add(lstHp);    p14.add(new Label("--", Label.CENTER));
		p14.add(tfHp1);    p14.add(new Label("--", Label.CENTER));   p14.add(tfHp2);
		pMain.add(p14);
		////////////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////   직업 선택 Panel  ///////////////////////////////////
		p15 = new Panel();
		p15.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbJob = new Label("  직    업  ", Label.CENTER);
		lbJob.setBackground(Color.yellow);
		lstJob = new Choice();
		lstJob.add("- 직업 선택 -");    lstJob.add("학생");    lstJob.add("컴퓨터/인터넷");
		lstJob.add("서비스업");     lstJob.add("교육");    lstJob.add("금융/증권/보험업");
		lstJob.add("유통업");    lstJob.add("예술");     	lstJob.add("의료");
		lstJob.add("건설업");   lstJob.add("제조업");    lstJob.add("농/수/임업");
		lstJob.add("전업주부");    lstJob.add("기타");    
		p15.add(lbJob);    p15.add(lstJob);		pMain.add(p15);
		/////////////////////////////////////////////////////////////////////////////////////////

		/////////////////////  취미 선택 Panel  /////////////////////////////////
		p16 = new Panel();
		p16.setLayout(new FlowLayout(FlowLayout.LEFT));
		lbHabit = new Label("  취    미  ", Label.CENTER);
		lbHabit.setBackground(Color.yellow);
		cbReading = new Checkbox("독서");
		cbBaduk = new Checkbox("바둑");
		cbGame = new Checkbox("게임");
		cbVideo = new Checkbox("영화감상");
		cbMusic = new Checkbox("음악감상");
		cbFlower = new Checkbox("꽃꽂이");
		p16.add(lbHabit);
		p16.add(cbReading);  p16.add(cbBaduk);   p16.add(cbGame);
		p16.add(cbVideo);      p16.add(cbMusic);    p16.add(cbFlower);
		pMain.add(p16);
		//////////////////////////////////////////////////////////////////////////////////////

		/////////////  가입축하 Dialog Design  ////////////////////////////
		dGaip = new Dialog(f, "가입 축하 창", false);
		dGaip.add(new Label("Congratulation", Label.CENTER), "North");
		dGaip.add(new Label("회원가입을 진심으로 축하드립니다", Label.CENTER), "Center");
		btnGaipClose = new Button("닫기");
		btnGaipClose.addActionListener(this);
		dGaip.add(btnGaipClose, "South");
		dGaip.setBackground(Color.magenta);
		dGaip.setSize(230, 100);
		////////////////////////////////////////////////////////////////////////////////////

		////////////  필수항목 미 기입 Error Dialog Design  ///////////////////
		dError = new Dialog(f, "Error", false);
		dError.add(new Label("Error!!!!!!!", Label.CENTER), "North");
		dError.add(new Label("필수항목중 값이 없는 것이 있습니다.", Label.CENTER), "Center");
		btnErrorClose = new Button("닫기");
		btnErrorClose.addActionListener(this);
		dError.add(btnErrorClose, "South");
		dError.setBackground(Color.red);
		dError.setSize(230,100);
		/////////////////////////////////////////////////////////////////////////////////////

		pSouth = new Panel();  //South panel
		btnPrint = new Button("Print");
		btnPrint.addActionListener(this);    //Print Button을 누를때 이벤트 등록
		btnPrint.setBackground(Color.cyan);
		btnExit = new Button("Exit");
		btnExit.addActionListener(this);  //Exit Button을 누를때 이벤트 등록
		btnExit.setBackground(Color.cyan);
		pSouth.add(btnPrint);   pSouth.add(btnExit);
		p.add(pMain, "Center");   //Panel에 16행 1열짜리 pMain Panel붙이기
		p.add(pSouth, "South");   //Panel에 <확인>과 <다시쓰기>버튼이 있는 pSouth Panel붙이기
		sp.add(p);   //ScrollPane에 Panel붙이기
		f.add(sp);    //Frame에 ScrollPane붙이기
		f.setSize(400,500);
		f.setResizable(false);    //사용자가 Frame Size 조절못하게 Size고정
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(btnIDJungbok)){   //id중복확인버튼을 눌렀다면
			lbIDCheck.setText(tfID.getText().trim() + "은(는) 사용할 수 없는 아이디입니다");
			dIDCheck.setVisible(true);
		}else if(e.getSource().equals(btnIDClose)){  //dialog close버튼을 누르면
			if(tfIDJungbok.getText().length() > 0)	dIDCheck.setVisible(false);  //dialog 숨기기
			tfID.setText(tfIDJungbok.getText().trim());
			btnIDJungbok.transferFocus();
		}else if(e.getSource().equals(tfIDJungbok)){  //새 아이디를 입력 후 엔터칠 때
			if(tfIDJungbok.getText().length() > 0)	dIDCheck.setVisible(false);  //dialog 숨기기
			tfID.setText(tfIDJungbok.getText().trim());
			btnIDJungbok.transferFocus();
		}else if(e.getSource().equals(btnPwdClose)){   //비밀번호확인창을 닫았다면
			tfPwd.setText("");
			tfPwd1.setText("");
			dPwdCheck.setVisible(false);
			btnIDJungbok.transferFocus();
		}else if(e.getSource().equals(btnZip)){   //우편번호확인을 눌렀다면
			dZip.setVisible(true);
		}else if(e.getSource().equals(btnZipClose)){  //우편번호창을 닫았다면
			String zip = tfZip.getText();
			tfZip1.setText(zip.substring(0,3));
			tfZip2.setText(zip.substring(4,7));
			tfAddr1.setText(zip.substring(7));
			tfAddr1.transferFocus();
			dZip.setVisible(false);
		}else if(e.getSource().equals(btnJuminClose)){
			if(isOk){
				tfJumin2.transferFocus();
				dJuminCheck.setVisible(false);
			}else{
				tfJumin1.setText("");
				tfJumin2.setText("");
				tfName.transferFocus();
				dJuminCheck.setVisible(false);
			}
		}else if(e.getSource().equals(btnPrint)){  //Print Button을 눌렀다면
			//필수입력항목의 값이 모두 있다면
			if(tfID.getText().length() > 0 & tfPwd.getText().length() > 0 & tfPwd1.getText().length() > 0 & tfName.getText().length() > 0){  
				dGaip.setVisible(true);
			}else{   //한개라도 없다면
				dError.setVisible(true);
			}
		}else if(e.getSource().equals(btnExit)){   //Exit Button을 눌렀다면
			f.setVisible(false);
			f.dispose();
			System.exit(0);   //Frame 종료
		}else if(e.getSource().equals(btnGaipClose)){   //가입축하 창을 닫았을 때
			dGaip.setVisible(false);
			printAll();
		}else if(e.getSource().equals(btnErrorClose)){   //Error 창을 닫았을 때
			dError.setVisible(false);
			btnIDJungbok.transferFocusBackward();    //중복확인버튼 바로 전의 tfID에 포커스를 맞춤
		}
	}
	public void focusGained(FocusEvent e){}
	//tfJumin2에서 Focus를 잃었을 때 호출
	public void focusLost(FocusEvent e){
		String jumin1 = tfJumin1.getText().trim();
		String jumin2 = tfJumin2.getText().trim();
		isOk = checkJumin(jumin1, jumin2);
		if(isOk){
			selectGender(jumin2);
			selectBirthday(jumin1, jumin2);
			lbJumin.setText("제대로 입력하셨군요");
		}else{
			lbJumin.setText("다시 입력해 주세요");
		}
		dJuminCheck.setVisible(true);
	}
	public boolean checkJumin(String jumin1, String jumin2){
		String jumin = jumin1 + jumin2;
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
		if((mod % 10) == intArray[12]) return true;
		else return false;
	}
	public void selectGender(String jumin2){
		if(jumin2.charAt(0) == '1' | jumin2.charAt(0) == '3'){   //남자
			cbMale.setState(true);   //남자선택
		}else if(jumin2.charAt(0) == '2' | jumin2.charAt(0) == '4'){  //여자라면
			cbFemale.setState(true);    //여자선택
		}else{    //그외라면
			cbGita.setState(true);    //기타선택
		}
	}
	public void selectBirthday(String jumin1, String jumin2){
		String year="", month="", day="";
		if(jumin2.charAt(0) == '1' | jumin2.charAt(0) == '2'){   //1이나 2면 
			year="19" + jumin1.substring(0,2);     //1900년도 사람
		}else{     //아니면
			year="20" + jumin1.substring(0,2);   //2000년대 사람
		}
		month = jumin1.substring(2,4);
		if(month.charAt(0) == '0'){    //10월보다 작으면
			month = month.substring(1);   //04 ==> 4   0빼내기
		}
		day = jumin1.substring(4);
		if(day.charAt(0) == '0'){    //10일보다 작으면
			day = day.substring(1);   //08 ==> 8   0빼내기
		}
		lstYear.select(year);     //생년월일에서 년도 선택
		lstMonth.select(month);    //월선택
		lstDay.select(day);    //일 선택
	}
	public void printAll(){
		String userid = tfID.getText().trim();
		String pwd = tfPwd.getText().trim();
		String name = tfName.getText().trim();
		String juminNumber = tfJumin1.getText().trim() + "-" + tfJumin2.getText().trim();
		String gender = "";
		if(cbMale.getState() == true)  gender = "남자";
		else if(cbFemale.getState() == true)  gender = "여자";
		else gender = "기타";
		String birthday = lstYear.getSelectedItem() + "년 " + lstMonth.getSelectedItem() + "월 " + lstDay.getSelectedItem() + "일";
		String zip = tfZip1.getText() + "-" + tfZip2.getText();
		String address = tfAddr1.getText().trim() + " " + tfAddr2.getText().trim();
		String tel = tfTel1.getText().trim() + "-" + tfTel2.getText().trim() + "-" + tfTel2.getText().trim();
		String hp = lstHp.getSelectedItem() + "-" + tfHp1.getText().trim() + "-" + tfHp2.getText().trim();
		String job = lstJob.getSelectedItem();
		String habit = "";
		if(cbReading.getState() == true)	habit += cbReading.getLabel() + ",";	
		if(cbBaduk.getState() == true)	habit += cbBaduk.getLabel() + ",";
		if(cbGame.getState() == true)	habit += cbGame.getLabel() + ",";
		if(cbMusic.getState() == true)	habit += cbMusic.getLabel() + ",";
		if(cbVideo.getState() == true)	habit += cbVideo.getLabel() + ",";
		if(cbFlower.getState() == true)	habit += cbFlower.getLabel() + ",";
		habit = habit.substring(0,habit.length()-1);
		System.out.println("=============Member Information================");
		System.out.println();
		System.out.println("UserID : " + userid);
		System.out.println("Password : " + pwd);
		System.out.println("User Name : " + name);
		System.out.println("Social Number : " + juminNumber);
		System.out.println("Gender : " + gender);
		System.out.println("Brithday : " + birthday);
		System.out.println("Zip Code : " + zip);
		System.out.println("Address : " + address);
		System.out.println("Tel : " + tel);
		System.out.println("Celluar Phone : " + hp);
		System.out.println("Job : " + job);
		System.out.println("Habit : " + habit);
		System.out.println("\n\n");
		System.out.println("Program is Over...");
	}
	public static void main(String[] args) {
		new Gaip().go();	
	}
}

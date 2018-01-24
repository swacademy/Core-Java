import java.awt.*;

public class GridBagLayoutTest	{
	private Frame f;
	private Checkbox cb1, cb2;
	private TextField tf;
	private Button b1, b2, b3;
	private GridBagLayout grid;
	private GridBagConstraints con;			// 제약조건을 위해

	public void go() {
		// 1. GridBagLayout 객체생성
		grid = new GridBagLayout();		// parameter가 없는 생성자만 생성
		// 2. GridBagConstraints  객체생성
		con = new GridBagConstraints();
		// 3. Frame의 Layout 설정
		f = new Frame("GridBagLayoutTest");
		f.setLayout(grid);

		cb1 = new Checkbox("Radio");
		cb2 = new Checkbox("Computer");
		tf = new TextField();
		b1 = new Button("Click Me!");
		b2 = new Button("Open");
		b3 = new Button("Close");

		// 4. Constraints 의 제약 걸기				// BOTH 는 static 이므로 '클래스.BOTH'
		con.fill = GridBagConstraints.BOTH;		// fill 은 static 이 아니므로 '참조변수.fill'
		// Radio Checkbox 붙이기
		con.gridx = 0;		con.gridy = 0;
		grid.setConstraints(cb1, con);			// (component, constraints객체);	
		f.add(cb1);
		// Cumputer Checkbox 붙이기
		con.gridx = 1;		con.gridy = 0;
		grid.setConstraints(cb2, con);
		f.add(cb2);
		// TextField 붙이기
		con.gridx = 0;		con.gridy =1;		con.gridwidth = 2;	
		grid.setConstraints(tf, con);
		f.add(tf);
		// button 붙이기
		con.gridx = 0;		con.gridy = 2;		con.gridwidth = 1;		con.gridheight = 2;
		grid.setConstraints(b1, con);
		f.add(b1);
		// button open 
		con.gridx = 1;		con.gridy = 2;		con.gridheight = 1;
		grid.setConstraints(b2, con);
		f.add(b2);
		// button close
		con.gridx = 1;		con.gridy = 3;		
		grid.setConstraints(b3, con);
		f.add(b3);

		//f.setSize(300, 300);
		f.pack();				
		f.setVisible(true);
	}
	public static void main(String[] args) 	{
		new GridBagLayoutTest().go();	
	}
}

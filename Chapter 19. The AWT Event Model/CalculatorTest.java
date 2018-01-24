import java.awt.*;
import java.awt.event.*;  //1. step
public class  CalculatorTest implements ActionListener{   //4. step
	private Frame f;
	private Panel p,p1, p2;
	private Button bPlus, bMinus, bGop, bNa, bPer,bClear,bExit;
	private Label lbFirst,lbSecond,lbResult;
	private TextField tfFirst, tfSecond, tfResult;
	public void go(){
		f = new Frame("Calculator Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		p1 = new Panel();
		p2 = new Panel();
		bPlus = new Button("+");
		bPlus.addActionListener(this);   //2.step
		bMinus = new Button("-");
		bMinus.addActionListener(this);
		bGop = new Button("X");
		bGop.addActionListener(this);
		bNa = new Button("/");
		bNa.addActionListener(this);
		bPer = new Button("%");
		bPer.addActionListener(this);
		bClear = new Button("Clear");
		bClear.addActionListener(this);
		bClear.setBackground(Color.orange);
		bExit = new Button("Exit");
		bExit.addActionListener(this);
		bExit.setBackground(Color.orange);

		tfFirst = new TextField("0");
		tfFirst.setBackground(Color.cyan);
		tfSecond = new TextField("0");
		tfSecond.setBackground(Color.cyan);
		tfResult = new TextField("0");
		tfResult.setBackground(Color.cyan);
		tfFirst.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent e){  //focus를 얻었을때
				tfFirst.setText("");
				tfSecond.setText("");
				tfResult.setText("");
			}
		});

		p.setLayout(new  GridLayout(1,2));  //윗패널
		p.add(bClear);   p.add(bExit);

		p1.setLayout(new GridLayout(3,2));
		p1.add(lbFirst = new Label("첫째수", Label.CENTER));
		lbFirst.setBackground(Color.yellow);
		p1.add(tfFirst);
		p1.add(lbSecond = new Label("둘째수", Label.CENTER));
		lbSecond.setBackground(Color.yellow);
		p1.add(tfSecond);
		p1.add(lbResult = new Label("결과", Label.CENTER));
		lbResult.setBackground(Color.yellow);
		p1.add(tfResult);

		p2.setLayout(new GridLayout(1,5));
		p2.add(bPlus);
		p2.add(bMinus);
		p2.add(bGop);
		p2.add(bNa);
		p2.add(bPer);

		f.add(p, "North");
		f.add(p1,"Center");
		f.add(p2, "South");
		f.pack();
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){    //3. step
		String str = e.getActionCommand();
		int first = Integer.parseInt(tfFirst.getText().trim());
		int second = Integer.parseInt(tfSecond.getText().trim());
		//char ch = str.charAt(0);
		//switch(ch){
		switch(str.charAt(0)){
			case '+': tfResult.setText((first + second) + "");  break;
			case '-': tfResult.setText((first - second) + "");  break;
			case 'X': tfResult.setText((first * second) + "");  break;
			case '/': tfResult.setText((first / second) + "");  break;
			case '%': tfResult.setText((first % second) + "");  break;
			case 'C': 
				  tfFirst.setText("");  tfSecond.setText("");  tfResult.setText("");
			      break;
			default: 
				    f.setVisible(false);
					f.dispose();
	     			System.exit(0);  //Exit 버튼을 눌렀다면
		}
	}
	public static void main(String[] args) {
		new CalculatorTest().go();
	}
}

/*
	Source : 정보문화사, 웹프로그래밍 시리즈 JAVA, 류한석 저, 2001-02-01, p267 ~ p274 
*/
import java.awt.*;
import java.awt.event.*;

public class Calc extends WindowAdapter implements ActionListener {

	private Frame f;

	private Button key0,key1,key2,key3,key4,key5,key6,key7,key8,key9;
	private Button keyequal,keyplus,keyminus,keyperiod,keymult,keydiv;
	private Panel buttonArea;

	private TextField answer;
	private boolean periodSet = false;
	private boolean clearNow = false;
	private boolean clearAfter = false;
	private double firstNumber = 0;
	private String lastMethod;

	public static void main(String args[]) {
		Calc calcGUI = new Calc();
		calcGUI.go();
	}

	public void go() {
		answer = new TextField(15);
		answer.setEditable(false);

		key0 = new Button("0");
		key1 = new Button("1");
		key2 = new Button("2");
		key3 = new Button("3");
		key4 = new Button("4");
		key5 = new Button("5");
		key6 = new Button("6");
		key7 = new Button("7");
		key8 = new Button("8");
		key9 = new Button("9");
		keyequal = new Button("=");
		keyplus = new Button("+");
		keyminus = new Button("-");
		keymult = new Button("*");
		keydiv = new Button("/");
		keyperiod = new Button(".");

		key0.addActionListener(this);
		key1.addActionListener(this);
		key2.addActionListener(this);
		key3.addActionListener(this);
		key4.addActionListener(this);
		key5.addActionListener(this);
		key6.addActionListener(this);
		key7.addActionListener(this);
		key8.addActionListener(this);
		key9.addActionListener(this);
		keyplus.addActionListener(this);
		keyminus.addActionListener(this);
		keymult.addActionListener(this);
		keydiv.addActionListener(this);
		keyequal.addActionListener(this);
		keyperiod.addActionListener(this);

		buttonArea = new Panel();
		buttonArea.setLayout(new GridLayout(4,3));

		buttonArea.add(key7);
		buttonArea.add(key8);
		buttonArea.add(key9);
		buttonArea.add(keyplus);
		buttonArea.add(key4);
		buttonArea.add(key5);
		buttonArea.add(key6);
		buttonArea.add(keyminus);
		buttonArea.add(key1);
		buttonArea.add(key2);
		buttonArea.add(key3);
		buttonArea.add(keymult);
		buttonArea.add(key0);
		buttonArea.add(keyperiod);
		buttonArea.add(keyequal);
		buttonArea.add(keydiv);

		
		f = new Frame("Level 1 lab");
		f.addWindowListener (this);
		f.setSize (200, 200);

		f.add(answer, "North");
		f.add(buttonArea, "Center");
		f.setVisible (true);
	}

        public void actionPerformed (ActionEvent e) {
		String bLabel = (String)e.getActionCommand();

                if (clearNow) {
			if (lastMethod == "equal" && (bLabel.equals("+") ||
bLabel.equals("-") || bLabel.equals("*") || bLabel.equals("/"))) {
				clearNow = false;
			} else {
	                        answer.setText("");
        	                clearNow = false;
			}
                }

                String current = answer.getText();

                if (bLabel.equals(".")) {
                        if (!periodSet) {
                                periodSet = true;
                                answer.setText(current+".");
                        }
                } else if (bLabel.equals("+")) {
                        if (lastMethod == "plus") {
                                firstNumber += Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "minus") {
                                firstNumber -= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "mult") {
                                firstNumber *= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "div") {
                                firstNumber /= Double.valueOf(current).doubleValue();
			} else {
	                        firstNumber = Double.valueOf(current).doubleValue();
			}
                        lastMethod = "plus";
                        periodSet = false;
                        clearNow = true;
                } else if (bLabel.equals("-")) {
                        if (lastMethod == "plus") {
                                firstNumber += Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "minus") {
                                firstNumber -= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "mult") {
                                firstNumber *= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "div") {
                                firstNumber /= Double.valueOf(current).doubleValue();
                        } else {
	                        firstNumber = Double.valueOf(current).doubleValue();
			}
                        lastMethod = "minus";
                        periodSet = false;
                        clearNow = true;
                } else if (bLabel.equals("*")) {
                        if (lastMethod == "plus") {
                                firstNumber += Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "minus") {
                                firstNumber -= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "mult") {
                                firstNumber *= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "div") {
                                firstNumber /= Double.valueOf(current).doubleValue();
                        } else {
	                        firstNumber = Double.valueOf(current).doubleValue();
			}
                        lastMethod = "mult";
                        periodSet = false;
                        clearNow = true;
                } else if (bLabel.equals("/")) {
                        if (lastMethod == "plus") {
                                firstNumber += Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "minus") {
                                firstNumber -= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "mult") {
                                firstNumber *= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "div") {
                                firstNumber /= Double.valueOf(current).doubleValue();
                        } else {
                        	firstNumber = Double.valueOf(current).doubleValue();
			}
                        lastMethod = "div";
                        periodSet = false;
                        clearNow = true;
                } else if (bLabel.equals("=")) {
                        if (lastMethod == "plus") {
                                firstNumber += Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "minus") {
                                firstNumber -= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "mult") {
                                firstNumber *= Double.valueOf(current).doubleValue();
                        } else if (lastMethod == "div") {
                                firstNumber /= Double.valueOf(current).doubleValue();
                        }
                        answer.setText(new Float(firstNumber).toString());
                        firstNumber = 0;
                        clearNow = true;
			lastMethod = "equal";
                } else {
                        answer.setText(current+bLabel);
		}
        }

	
	public void windowClosing (WindowEvent e) {
        	e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
	}

}


 

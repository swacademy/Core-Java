import java.awt.*;

public class Calculator	{
	private Frame f;
	private Panel p;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bGop,bNa,bEqual,bDot;
	public void go() {
		f = new Frame("계산기");
		p = new Panel();
		b1 = new Button("1");	
		b2 = new Button("2");	
		b3 = new Button("3");	
		b4 = new Button("4");	
		b5 = new Button("5");	
		b6 = new Button("6");	
		b7 = new Button("7");	
		b8 = new Button("8");	
		b9 = new Button("9");	
		b0 = new Button("0");	
		bPlus = new Button("+");	
		bMinus = new Button("-");	
		bGop = new Button("X");	
		bNa = new Button("/");	
		bDot = new Button(".");	
		bEqual = new Button("=");	
		
		p.setLayout(new GridLayout(4,4));
		p.add(b7);		p.add(b8);		p.add(b9);		p.add(bPlus);		
		p.add(b4);		p.add(b5);		p.add(b6);		p.add(bMinus);	
		p.add(b1);		p.add(b2);		p.add(b3);		p.add(bGop);	
		p.add(b0);		p.add(bDot);	 	p.add(bEqual);		p.add(bNa);	
		f.add(new Label("0.0", Label.RIGHT), "North");
		f.add(p, "Center");		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) 	{
		new Calculator().go();	
	}
}

import java.awt.*;
public class GridLayoutTest{
	private Frame f;
	private Button b1, b2, b3,b4, b5, b6;

	public void go(){
		f = new Frame("This ia a GridLayoutTest");
		b1 = new Button("1");
		b1.setBackground(Color.red);
		b2 = new Button("2");
		b2.setBackground(Color.orange);
		b3 = new Button("3");
		b3.setBackground(Color.yellow);
		b4 = new Button("4");
		b4.setBackground(Color.green);
		b5 = new Button("5");
		b5.setBackground(Color.blue);
		b6 = new Button("6");
		b6.setBackground(Color.magenta);

		f.setLayout(new GridLayout(2,3, 10, 20));
		f.add(b1);   		f.add(b2);    		f.add(b3);
		f.add(b4);   		f.add(b5);    		f.add(b6);

		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest().go();
	}
}

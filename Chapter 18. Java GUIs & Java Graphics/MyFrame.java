import java.awt.*;
public class MyFrame extends Frame{
	public MyFrame(String title){
		super(title);
	}
	public static void main(String[] args) {
		MyFrame mf = new MyFrame("This is a Frame Test");

		mf.setSize(300,300);
		mf.setBackground(Color.red);
		mf.setVisible(true);
	}
}

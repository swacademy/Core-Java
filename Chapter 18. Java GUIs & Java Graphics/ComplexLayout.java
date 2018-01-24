import java.awt.*;

public class ComplexLayout	{
	private Frame f;
	private Panel p;
	private Button bHelp, bFile, bWest, bCenter;
	public void go() {
		f = new Frame("ComplexLayout");
		p = new Panel();
		p.setBackground(Color.red);
		bHelp = new Button("Help");
		bFile = new Button("File");
		bWest = new Button("West");
		bCenter = new Button("Work space Region");
		//panel 생성하기
		p.add(bFile);		p.add(bHelp);
		f.add(p, "North");
		f.add(bWest, "West");
		f.add(bCenter, "Center");
		//f.setSize(300, 300);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) 	{
		new ComplexLayout().go();	
	}
}

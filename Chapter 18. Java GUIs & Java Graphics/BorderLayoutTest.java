import java.awt.*;
public class BorderLayoutTest{
	private Frame f;
	private Button bNorth, bSouth, bWest, bEast, bCenter;
	public void go(){
		f = new Frame("This is a BorderLayoutTest");
		bNorth = new Button("北");
		bSouth = new Button("南");
		bWest = new Button("西");
		bCenter = new Button("中");
		bEast = new Button("東");


		f.setLayout(new BorderLayout(5, 10));
		f.add(bNorth, BorderLayout.NORTH);   //1
		f.add(BorderLayout.SOUTH, bSouth);  //2
		f.add(bWest, "West");    //3
		f.add("East", bEast);   //4
		f.add(bCenter, "Center");

		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutTest().go();	
	}
}

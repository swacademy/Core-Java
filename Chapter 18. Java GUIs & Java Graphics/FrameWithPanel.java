import java.awt.*;
public class FrameWithPanel extends Frame{
	public FrameWithPanel(String title){
		super(title);
	}
	public static void main(String[] args) {
		FrameWithPanel  fwp = new FrameWithPanel("This is a Panel Test");
		fwp.setLayout(null);

		Panel p = new Panel();
		p.setSize(200,150);
		p.setBackground(Color.yellow);

		fwp.add(p);    //프레임에  패널 추가
		fwp.setSize(400,300);
		fwp.setBackground(Color.cyan);
		fwp.setVisible(true);
	}
}

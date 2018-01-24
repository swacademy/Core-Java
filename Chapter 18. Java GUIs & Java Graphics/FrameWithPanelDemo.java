import java.awt.*;

public class FrameWithPanelDemo {
	private Frame f;
	private Panel p;
	public void go(){
		f = new Frame("Frame with Panel");
		f.setLayout(null);
		f.setSize(500,400);
		f.setBackground(Color.YELLOW);

		p = new Panel();
		p.setBackground(Color.RED);
		p.setSize(200,300);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameWithPanelDemo().go();
	}
}

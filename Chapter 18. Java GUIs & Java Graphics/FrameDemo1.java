import java.awt.*;

public class FrameDemo1 {
	private Frame f;
	public void go(){
		f = new Frame("Hello Frame");
		f.setSize(500, 400);
		f.setBackground(Color.YELLOW);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		FrameDemo1 fd = new FrameDemo1();
		fd.go();
	}
}

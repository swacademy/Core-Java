import java.awt.*;

public class FrameDemo extends Frame {
	public static void main(String[] args) {
		FrameDemo fd = new FrameDemo();
		fd.setTitle("Hello Frame");
		fd.setSize(500,400);
		fd.setBackground(Color.YELLOW);
		fd.setVisible(true);
	}
}

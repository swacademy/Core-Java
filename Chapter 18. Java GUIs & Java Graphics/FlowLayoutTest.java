import java.awt.*;
public class FlowLayoutTest{
	private Frame f;
	private Button  bOpen, bClose, bOk;

	public void go(){
		f = new Frame("This is a FlowLayoutTest");  //Frame의 Title
		bOpen = new Button("열                 기");
		bOpen.setBackground(Color.red);
		bClose = new Button("닫기");
		bClose.setBackground(Color.yellow);
		bOk = new Button("확인");
		bOk.setBackground(Color.blue);

		//f.setLayout(new FlowLayout());  //간격 5unit, 가운데 정렬
		//f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
		f.add(bOpen);
		f.add(bClose);
		f.add(bOk);

		f.setSize(300,300);
		f.setBackground(Color.green);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutTest().go();	
	}
}

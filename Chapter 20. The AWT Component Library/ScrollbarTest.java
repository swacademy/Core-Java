import java.awt.*;
import java.awt.event.*;

class ScrollbarTest implements AdjustmentListener{
	private Frame f;
	private Panel p;
	private Label rLabel, gLabel, bLabel;
	private Scrollbar  rSc, gSc, bSc;
	private Canvas  c;
	public void go(){
		f = new Frame("This is a Scrollbar Test");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();
		p.setLayout(new GridLayout(3,2));
		rLabel = new Label("Red : 0");
		rLabel.setBackground(Color.red);
		gLabel = new Label("Green : 0");
		gLabel.setBackground(Color.green);
		bLabel = new Label("Blue : 0");
		bLabel.setBackground(Color.blue);
		rSc = new Scrollbar(Scrollbar.HORIZONTAL, 0,0,0,256);
		rSc.addAdjustmentListener(this);
		gSc = new Scrollbar(Scrollbar.HORIZONTAL, 0,0,0,256);
		gSc.addAdjustmentListener(this);
		bSc = new Scrollbar(Scrollbar.HORIZONTAL, 0,0,0,256);
		bSc.addAdjustmentListener(this);
		p.add(rLabel);   p.add(rSc);
		p.add(gLabel);  p.add(gSc);
		p.add(bLabel);   p.add(bSc);
		c = new Canvas();
		c.setBackground(Color.black);
		f.add(p, "North");
		f.add(c, "Center");
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e){
		Object obj = e.getSource();
		if(obj.equals(rSc)){
			rLabel.setText("Red : " + e.getValue());
		}else if(obj.equals(gSc)){
			gLabel.setText("Green : " + e.getValue());
		}else if(obj.equals(bSc)){
			bLabel.setText("Blue : " + e.getValue());
		}
		c.setBackground(new Color(rSc.getValue(), gSc.getValue(), bSc.getValue()));
	}
	public static void main(String[] args) {
		new ScrollbarTest().go();	
	}
}
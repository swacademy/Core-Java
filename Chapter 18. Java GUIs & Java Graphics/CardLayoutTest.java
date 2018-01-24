import java.awt.*;
import java.awt.event.*;
public class CardLayoutTest implements MouseListener{
	private Frame f;
	private Panel p1, p2, p3, p4, p5;
	private Label lab1, lab2, lab3, lab4, lab5;
	private CardLayout  myCard;

	public void go(){
		f = new Frame("카드 테스트");
		myCard = new CardLayout();
		p1 = new Panel();
		p1.addMouseListener(this);
		p1.setBackground(Color.red);
		p2 = new Panel();
		p2.addMouseListener(this);
		p2.setBackground(Color.yellow);
		p3 = new Panel();
		p3.addMouseListener(this);
		p3.setBackground(Color.green);
		p4 = new Panel();
		p4.addMouseListener(this);
		p4.setBackground(Color.blue);
		p5 = new Panel();
		p5.addMouseListener(this);
		p5.setBackground(Color.magenta);
		lab1 = new Label("This is a First Panel");
		lab2 = new Label("This is a Second Panel");
		lab3 = new Label("This is a Third Panel");
		lab4 = new Label("This is a Fourth Panel");
		lab5 = new Label("This is a Fifth Panel");

		p1.add(lab1);    p2.add(lab2);
		p3.add(lab3);    p4.add(lab4); 
		p5.add(lab5);

		f.setLayout(myCard);

		f.add(p1, "First");
		f.add(p2, "Second");
		f.add(p3, "Third");
		f.add(p4, "Fourth");
		f.add(p5, "Fifth");

		myCard.show(f, "First");
		f.setSize(200,300);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
		//myCard.next(f);
	}
	public void mouseEntered(MouseEvent e){
		myCard.next(f);
	}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

	public static void main(String[] args) {
		new CardLayoutTest().go();
	}
}

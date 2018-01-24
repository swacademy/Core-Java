import java.awt.*;
import java.awt.event.*;  

public class ShoppingMall implements ActionListener, ItemListener{
	private Frame f;
	private Panel p, p1;
	private TextField tfAdd, tfRemove;
	private Button bAdd, bRemove;
	private List cart;
	private Image image;
	public void go(){
		f = new Frame("쇼핑몰");
		image = Toolkit.getDefaultToolkit().getImage("1.gif");
		f.setIconImage(image);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		p = new Panel();  //윗패널
		p1 = new Panel();  //아랫패널
		tfAdd = new TextField(20);
		tfAdd.addActionListener(this);   
		tfRemove = new TextField(20);  
		tfRemove.addActionListener(this);  
		bAdd = new Button("담기");
		bAdd.addActionListener(this);  
		bRemove = new Button("빼기");
		bRemove.addActionListener(this);  
		cart = new List();
		cart.addItemListener(this); 
		p.add(new Label("카트에 담기"));
		p.add(tfAdd);    p.add(bAdd);

		p1.add(new Label("제거하기"));
		p1.add(tfRemove);
		p1.add(bRemove);

		f.add(p, "North");
		f.add(cart, "Center");
		f.add(p1, "South");

		f.setSize(320,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(tfAdd) || e.getSource().equals(bAdd)){  
			//event source가 tfAdd이거나, bAdd라면
			cart.add(tfAdd.getText().trim());
			tfAdd.setText("");
		}else{  //event source가 tfRemove이거나 bRemove라면
			try{
				cart.remove(tfRemove.getText().trim());
				tfRemove.setText("");
			}catch(Exception ex){
				tfRemove.setText("제거할 항목이 없습니다");
			}
		}
	}
	public void itemStateChanged(ItemEvent e){
		String item = cart.getSelectedItem();
		f.setTitle("쇼핑몰 - [" + item + "]");
		tfRemove.setText(item);
		cart.transferFocus();
	}
	public static void main(String[] args) {
		new ShoppingMall().go();	
	}
}

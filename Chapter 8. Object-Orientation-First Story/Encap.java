public class  Encap{
	public static void main(String[] args) {
		Sungjuk  sujan = new Sungjuk();
		//sujan.kor = 120;
		sujan.setKor(120);
		sujan.display();
	}
}
class Sungjuk{
	private int kor;
	public void setKor(int kor){
		if(kor >=0 && kor<=100)	this.kor = kor;
		else System.out.println("점수 다시 너어");
	}
	void display(){
		System.out.println("kor = " + kor);
	}
};
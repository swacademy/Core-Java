interface Datable{
	int SUN = 0, MON = 1, TUE = 2, WED = 3,THU = 4, FRI = 5, SAT = 6;
	//1. 상수이며, public static final이 생략됨. 따라서 반드시 초기화를 해야 함
	void setDate(int date);  //2. 메소드는 추상메소드이며,  public abstract를 생략한다.
	int getDate();									
}
class Dated  implements Datable{
	private int date;
	public void setDate(int date){   //3. interface method를 override 할때 public 에 주의하자.
		this.date = date;
	}
	public int getDate(){
		return this.date;
	}
};
public class InterfaceTest {
	public static void main(String[] args) {
		Datable d = new Dated();
		d.setDate(Datable.FRI);
		System.out.println(d.getDate());
	}
}

/*
 * 2. final method는 override할 수 없다. 
*/
public class FinalDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Jasik ja = new Jasik();
	}
}
class Bumo{
	final void display(){}
}
class Jasik extends Bumo{
	void display(){}
}
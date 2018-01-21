/*
 * Local Class는 외부 클래스의 멤버변수와 클래스변수 그리고 상수들만 접근가능하다.
 */
public class LocalClassDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		OuterClass2 outer = new OuterClass2();
		outer.innerTest(1000);
	}
}
class OuterClass2{
	int i = 10;  //member variable
	static int su = 11;
	final int num = 12;
	public void innerTest(int a){
		int j = 20;
		//static int b = 21;   //static 변수 사용못함
		final int c = 22;
		class LocalClass{
			public void getData(){
				System.out.println("i = " + i);
				System.out.println("su = " + su);  //접근가능
				System.out.println("num = " + num);  //상수도 가능
				//System.out.println("j = " + j);   //지역변수는 사용하지 못함 
				System.out.println("c = " + c);   //상수도 가능
			}
		};
		LocalClass  lc = new LocalClass();
		lc.getData();
	}
}
/*
i = 10
su = 11
num = 12
c = 22
*/
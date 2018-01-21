/*
  클래스에서는 static 변수가 가장 먼저 초기화됩니다.
  그리고 static method가 호출됩니다.
  메인메소드도 static method이기 때문에
  자동으로 호출됩니다.
  아래의 예에서는 마치 static method가 가장 먼저 호출되는 것 같지만,
  실제로는 su가 가장 먼저 초기화되고 그 다음 static 초기화, 그리고
  static method가 호출됩니다. 
 */
public class StaticDemo2 {
	static int su = staticMethod();    //static variable
	static int staticMethod(){             //static method
		System.out.println("난 스태틱메소드");
		return 5;
	}
	static {
		System.out.println("난 스태틱 초기화 블록");
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("난 메인메소드");
		System.out.println("su = " + su);
	}
}
/*
난 스태틱메소드
난 스태틱 초기화 블록
난 메인메소드
su = 5
*/
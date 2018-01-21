/*
 * Method's Override할 때의 Rule
 * 자식의 Override Method는 부모의 Override Method보다 범위가 같거나 넓어야 한다. 
  */
public class OverrideDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Super  ss = new Sub();
		ss.display();
	}
}
class Super{
	public void display(){
		System.out.println("나는 부모의 메소드");
	}
}
class Sub extends Super{
	void display(){   //에러 발생 왜?
		System.out.println("나는 자식의 메소드");
	}
}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	Super의 상속된 메소드에 대한 가시성을 줄일 수 없습니다.

	at Sub.display(OverrideDemo1.java:18)
	at OverrideDemo1.main(OverrideDemo1.java:9)
*/
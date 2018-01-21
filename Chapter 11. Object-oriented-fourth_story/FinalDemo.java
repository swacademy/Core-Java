/*
 * 1. final class는 상속할 수 없다.
 */
public class FinalDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Sub  s = new Sub();
	}
}
final class Super{}
class Sub extends Super{}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	Sub 유형은 final 클래스 Super을(를) 서브클래스화할 수 없습니다.

	at Sub.<init>(FinalDemo.java:11)
	at FinalDemo.main(FinalDemo.java:7)
*/
//3. final variable은 상수이기 때문에 값을 변경할 수 없다.
public class FinalDemo2 {
	static final int SU = 5;               //Java에서는 상수를 사용할 때 static final을 사용한다.
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		SU = 10;
	}
}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	FinalDemo2.SU final 필드를 지정할 수 없음

	at FinalDemo2.main(FinalDemo2.java:6)
*/
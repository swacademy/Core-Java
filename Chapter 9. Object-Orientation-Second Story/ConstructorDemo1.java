//상속 관계에서의 생성자 호출
//자식생성자는 항상 부모의 기본생성자만 호출
//이 코드는 에러남
public class ConstructorDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		C1 c = new C1();
	}

}
class A1{
	A1(){
		System.out.println("A1의 기본 생성자 호출");
	}
}
class B1 extends A1{
	B1(String name){
		System.out.println("B1의 기본 생성자 호출");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("C1의 기본 생성자 호출");
	}
}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	암시 상위 생성자 B1()이(가) 정의되지 않았습니다. 다른 생성자를 명시적으로 호출해야 합니다.

	at C1.<init>(ConstructorDemo1.java:22)
	at ConstructorDemo1.main(ConstructorDemo1.java:7)
*/
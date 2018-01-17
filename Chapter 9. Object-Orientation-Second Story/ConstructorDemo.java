//상속 관계에서의 생성자 호출
public class ConstructorDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		C c = new C();
	}

}
class A{
	A(){
		System.out.println("A의 기본 생성자 호출");
	}
}
class B extends A{
	B(){
		System.out.println("B의 기본 생성자 호출");
	}
}
class C extends B{
	C(){
		System.out.println("C의 기본 생성자 호출");
	}
}
/*
A의 기본 생성자 호출
B의 기본 생성자 호출
C의 기본 생성자 호출
*/
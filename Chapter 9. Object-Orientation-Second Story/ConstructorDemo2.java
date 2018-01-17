//상속 관계에서의 생성자 호출
//자식생성자는 항상 부모의 기본생성자만 호출
//해결하기 위해 super()사용
public class ConstructorDemo2 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		C2 c = new C2();
	}

}
class A2{
	A2(){
		System.out.println("A2의 기본 생성자 호출");
	}
}
class B2 extends A2{
	B2(String name){
		System.out.println("B2의 기본 생성자 호출");
	}
}
class C2 extends B2{
	C2(){
		super("테스트");
		System.out.println("C2의 기본 생성자 호출");
	}
}
/*
A2의 기본 생성자 호출
B2의 기본 생성자 호출
C2의 기본 생성자 호출
*/
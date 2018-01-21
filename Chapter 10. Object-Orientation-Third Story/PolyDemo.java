
public class PolyDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		r = a;
		r.call();
		r = b;
		r.call();
		r = c;
		r.call();
	}
}
class A{
	void call(){
		System.out.println("A클래스의 call() 호출");
	}
}
class B extends A{
	void call(){
		System.out.println("B클래스의 call() 호출");
	}
}
class C extends A{
	void call(){
		System.out.println("C클래스의 call() 호출");
	}
}
/*
A클래스의 call() 호출
B클래스의 call() 호출
C클래스의 call() 호출
*/
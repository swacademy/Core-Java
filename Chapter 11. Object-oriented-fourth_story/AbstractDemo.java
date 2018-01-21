
public class AbstractDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//A  a = new A();   //compile error, 추상클래스는 객체를 만들 수 없슴
		B b = new B();
		b.call_one();
		b.call_two("Michael");
		b.call_three();
	}
}
abstract class A{
	abstract void call_one();   //abstract method
	abstract void call_two(String name);   //abstract method
	//완전한 메소드
	void call_three(){
		System.out.println("내용을 갖는 완전한 메소드");
	}
}
class B extends A{  //추상클래스는 자식 클래스를 반드시 만들어야 함
	//부모 클래스의 추상메소드의 재정의
	void call_one(){
		System.out.println("B 클래스에서 완전하게 구현한 메소드");
	}
	void call_two(String name){
		System.out.println("안녕하세요 " + name + "님!");
	}
}
/*
B 클래스에서 완전하게 구현한 메소드
안녕하세요 Michael님!
내용을 갖는 완전한 메소드
*/
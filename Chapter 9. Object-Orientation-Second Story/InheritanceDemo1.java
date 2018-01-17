public class InheritanceDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Parent1 parent = new Parent1();
		Child1 child = new Child1();
		//부모클래스도 단독으로 사용할 수 있다.
		parent.a = 10;
		parent.b = 20;
		System.out.println("***********부모 클래스의 내용****************");
		parent.displayAB();
		System.out.println();
		
		//자식 클래스는 부모 클래스의 멤버들을 사용할 수 있다.
		child.a = 30;
		child.b = 40;
		child.c = 50;
		System.out.println("%%%%%%%%%자식 클래스의 내용%%%%%%%%%");
		child.displayAB();
		child.displayC();
		System.out.println();
		
		System.out.println("##########자식클래스의 a+b+c############");
		child.sum();
	}

}
class Parent1{
	int a;
	private int b;  //private
	void displayAB(){
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
class Child1 extends Parent1{
	int c;
	void displayC(){
		System.out.printf("c = %d\n", c);
	}
	void sum(){
		System.out.printf("a + b + c = %d\n", (a + b + c));
	}
}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	Parent1.b 필드가 가시적이지 않습니다.
	Parent1.b 필드가 가시적이지 않습니다.

	at InheritanceDemo1.main(InheritanceDemo1.java:8)
*/
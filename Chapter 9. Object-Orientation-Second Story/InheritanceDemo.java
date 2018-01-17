public class InheritanceDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Parent parent = new Parent();
		Child child = new Child();
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
class Parent{
	int a, b;
	void displayAB(){
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
class Child extends Parent{
	int c;
	void displayC(){
		System.out.printf("c = %d\n", c);
	}
	void sum(){
		System.out.printf("a + b + c = %d\n", (a + b + c));
	}
}
/*
***********부모 클래스의 내용****************
a = 10, b = 20

%%%%%%%%%자식 클래스의 내용%%%%%%%%%
a = 30, b = 40
c = 50

##########자식클래스의 a+b+c############
a + b + c = 120
*/
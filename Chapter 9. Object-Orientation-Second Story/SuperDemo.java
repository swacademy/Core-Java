public class SuperDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Child2 child = new Child2(30);
		 child.displayAB();
		 child.sum();
	}
}
class Parent2{
	int a, b;
	
	Parent2(int a, int b){   //생성자
		this.a = a;
		this.b = b;
	}
	
	void displayAB(){
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
class Child2 extends Parent2{
	int c;
	Child2(int c){   //생성자
		super(10,20);
		this.c = c;
	}
	void displayC(){
		System.out.printf("c = %d\n", c);
	}
	void sum(){
		System.out.printf("a + b + c = %d\n", (a + super.b + c));
	}
}
/*
a = 10, b = 20
a + b + c = 60
*/
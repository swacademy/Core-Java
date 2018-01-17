public class SuperDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Child3 child = new Child3(10,20);
		child.display();
	}
}
class Parent3{
	int a;
}
class Child3 extends Parent3{
	int a;  //Parent3의 a와 충돌 --> 숨긴다.
	Child3(int a, int b){
		super.a = a;
		this.a = b;
	}
	
	void display(){
		System.out.println("Parent3의 a : " + super.a);
		System.out.println("Child의 a : " + this.a);
	}
}
/*
Parent3의 a : 10
Child의 a : 20
*/
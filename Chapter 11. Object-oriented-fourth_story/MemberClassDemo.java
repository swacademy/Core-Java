
public class MemberClassDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass  inner = outer.new InnerClass();
		inner.print();
	}

}
class OuterClass{
	int i = 11;
	private int a = 100;
	static int su = 12;
	class InnerClass{
		int j = 21;
		//static void method(){}  //error   memberclass에서는 static은 사용할 수 없다.
		void print(){
			System.out.println("*****************내부클래스의 내용***********************");
			System.out.println("OuterClass의 i = " + i);
			System.out.println("OuterClass의 i = " + OuterClass.this.i);
			System.out.println("OuterClass의 su = " + su);
			System.out.println("OuterClass의 private 변수 a = " + a);  //주의하자...private변수도 접근 왜?
			System.out.println("InnerClass의 j = " + j);
		}
	}
	OuterClass(){   //Constructor
		InnerClass ic = new InnerClass();
		System.out.println("************외부 클래스의 내용***************");
		System.out.println("InnerClass의 j = " + ic.j);
	}
}
/*
************외부 클래스의 내용***************
InnerClass의 j = 21
*****************내부클래스의 내용***********************
OuterClass의 i = 11
OuterClass의 i = 11
OuterClass의 su = 12
OuterClass의 private 변수 a = 100
InnerClass의 j = 21
*/
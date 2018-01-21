public class StaticClassDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		OuterClass1 outer = new OuterClass1();
		OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
		nested.print();
		System.out.println("main()에서의 num = " + OuterClass1.NestedClass.num);
	}

}
class OuterClass1{
	int i = 11;
	static int su = 12;
	static class NestedClass{
		int j = 21;
		static int num = 22;
		void print(){
			System.out.println("*****************중첩 클래스의 내용***********************");
			//System.out.println("OuterClass1의 i = " + i);  //밖의 일반멤버변수는 접근 안됨
			System.out.println("OuterClass1의 su = " + su);
			System.out.println("NestedClass의 j = " + j);
			System.out.println("NestedClass의 num = " + num);
		}
	}
	OuterClass1(){   //Constructor
		NestedClass nc = new NestedClass();
		System.out.println("************외부 클래스의 내용***************");
		System.out.println("NestedClass의 j = " + nc.j);
	}
}
/*
************외부 클래스의 내용***************
NestedClass의 j = 21
*****************중첩 클래스의 내용***********************
OuterClass1의 su = 12
NestedClass의 j = 21
NestedClass의 num = 22
main()에서의 num = 22
*/
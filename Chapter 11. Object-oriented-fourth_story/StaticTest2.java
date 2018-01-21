public class  StaticTest2{
	static int x;   //static variable
	int a, b;        // member variable

	static{
		x = 10;  //static variable은 static block에 의해서 초기화된다.
	}
	public StaticTest2(){
		a = b = 5;   //member variable은 생성자에 의해서 초기화된다.
	}
	public static void main(String[] args) {
		StaticTest2  st = new StaticTest2();
		System.out.println("x = " + x);
		System.out.println("st.a = " + st.a);
	}
}

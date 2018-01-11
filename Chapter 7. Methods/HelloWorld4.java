public class  HelloWorld4{
	public static void main(String[] args) {
		Sample  s = new Sample();
		s.printTest();
	}
}
class Sample{
	void printTest(){  //member method, instance method
		System.out.println("Hello, World");
	}
};
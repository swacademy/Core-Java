public class ExceptionTest1 {
	public static void main(String[] args) {
		Test t = new Test();
		t = null;
		System.out.println(t.toString());  //NullPointerException 발생
	}
}
class Test{
};
/*
Exception in thread "main" java.lang.NullPointerException
	at ExceptionTest1.main(ExceptionTest1.java:5)
*/
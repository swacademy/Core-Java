public class  ExceptionTest2{
	public static void main(String[] args) {
		int su = -3;
		int [] array = new int[su];  //NegativeArraySizeException 발생
	}
}
/*
Exception in thread "main" java.lang.NegativeArraySizeException
	at ExceptionTest2.main(ExceptionTest2.java:4)
*/
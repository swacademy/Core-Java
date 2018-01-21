public class  ExceptionTest4{
	public static void main(String[] args) {
		int su = 5;
		int num = 0;
		try{
			System.out.println(su/num);
		}catch(NegativeArraySizeException e){
			System.out.println("NegativeArraySizeException");
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(Exception e){
			System.out.println("나는 걸리겠지");
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
/*
나는 걸리겠지
java.lang.ArithmeticException: / by zero
	at ExceptionTest4.main(ExceptionTest4.java:6)
*/
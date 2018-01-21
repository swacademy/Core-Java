public class  ExceptionTest6{
	public static void main(String[] args) {
		int su = 5;
		int num = 0;
		try{
			System.out.println(su/num);
		}catch(Exception e){
			e.printStackTrace();
		}catch(NegativeArraySizeException e){
			System.out.println("NegativeArraySizeException");
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}
	}
}
/*
Exception in thread "main" java.lang.Error: 분석되지 않는 컴파일 문제점: 
	NegativeArraySizeException에 대한 도달할 수 없는 catch 블록입니다. 이미 Exception에 대한 catch 블록에 의해 처리되었습니다.
	NullPointerException에 대한 도달할 수 없는 catch 블록입니다. 이미 Exception에 대한 catch 블록에 의해 처리되었습니다.

	at ExceptionTest6.main(ExceptionTest6.java:9)
*/
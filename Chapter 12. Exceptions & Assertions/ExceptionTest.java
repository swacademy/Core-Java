public class  ExceptionTest{
	public static void main(String[] args) {
		int su = 5;
		int num = 0;
		try{
			System.out.println(su/num);
		}catch(ArithmeticException e){
			System.out.println("익셉션 처리했슴");
		}
	}
}
/*
익셉션 처리했슴
*/
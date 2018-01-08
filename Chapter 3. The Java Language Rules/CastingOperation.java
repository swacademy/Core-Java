/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.69
*/

public class CastingOperation{
	public static void main(String[] args){ 
		char ch1 = 'A';
		char ch2 = 'Z';
			
		int num1 = ch1;
		int num2 = (int)ch2;

		System.out.println("문자 A의 유니코드 값: "+num1);
		System.out.println("문자 Z의 유니코드 값: "+num2);		
	}
}
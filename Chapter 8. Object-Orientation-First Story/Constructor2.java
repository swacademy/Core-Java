/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.196-197
*/

class Number1{
	int num;
	
	public Number1(int n){
		num=n;
		System.out.println("인자 전달: "+n);
	}
	public int getNumber(){
		return num;
	}
}

public class Constructor2{
	public static void main(String[] args){
		Number1 num1=new Number1(10);
		System.out.println("메소드 반환 값: "+num1.getNumber());
		
		Number1 num2=new Number1(20);
		System.out.println("메소드 반환 값: "+num2.getNumber());
	}	
}
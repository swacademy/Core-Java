/*
 * 클래스내에서 초기화 순서
 * static variable --> static initialize --> static method 
 */
public class StaticDemo3 {
	static int a = 3;
	static int b;
	static void math(int x){
		System.out.println("난 스태틱메소드");
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static{
		System.out.println("난 스태틱 블럭 초기화");
		b = a * 4;
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("난 메인메소드");
		math(40);
	}
}
/*
난 스태틱 블럭 초기화
난 메인메소드
난 스태틱메소드
x = 40
a = 3
b = 12
*/
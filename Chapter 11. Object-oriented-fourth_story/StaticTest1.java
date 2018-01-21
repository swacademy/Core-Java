public class StaticTest1 {
	static int x = getX();
	static int getX(){
		System.out.println("나는 스태틱메소드");
		return 10;
	}
	static{
		System.out.println("나는 스태택 블록");
	}
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드");
		System.out.println("x = " + x);
	}
}

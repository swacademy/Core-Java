
public class ExceptionTest7 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		new ExceptionTest7().a();
	}
	void a(){
		try{
			b();
		}catch(Exception e){
			System.out.println("a()에서 잡았슴");
		}
	}
	void b(){
		c();
	}
	void c(){
		System.out.println(5 / 0);   //실제의 익셉션 발생장소
	}
}
/*
a()에서 잡았슴
*/
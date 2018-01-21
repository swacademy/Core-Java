/*
 * 객체사이의 형변환
 * 1. 자식 ==> 부모
 *    1) 자동형변환  
 *         부모 = 자식;    잘됨
 *    2) 강제형변환
 *         부모 = (부모)자식;   역시잘됨
 * 2. 부모 ==> 자식
 *    1) 자동형변환
 *          자식 = 부모;    컴파일에러
 *    2) 강제형변환
 *         자식 = (자식)부모;    런타임에러(Exception) 발생
 *         따라서 반드시 instanceof로 검사할 것
 */
public class CastObjectDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Bumo b = new Bumo();
		Jasik ja = new Jasik();
		//b = ja;  //성공
		//b = (Bumo)ja;  //역시성공
		//ja = b;    //컴파일에러러
		ja = (Jasik)b;
		System.out.println(ja.b);
	}

}
class Bumo{
	int a = 5;
}
class Jasik extends Bumo{
	int b = 10;
}
/*
Exception in thread "main" java.lang.ClassCastException: Bumo
	at CastObjectDemo.main(CastObjectDemo.java:23)
*/
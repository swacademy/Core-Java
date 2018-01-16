/*
*조효은, 초보자를 위한 JAVA 200제(서울:정보문화사, 2011), p.321
*객체의 생성과 소멸 주기 정리하기
*/

public class Tank {
	
	public static int howmany=0;
	public int howfast=100;
	
	public void input(){
		howmany++;
	}
	public void increase(){
		howfast+=30;
	}
	public static int getHowMany(){
		return howmany;
	}
	public int getHowFast(){
		return howfast;
	}
	public void showShortLife(){
		int age=5;
		howfast-=age;
	}
}

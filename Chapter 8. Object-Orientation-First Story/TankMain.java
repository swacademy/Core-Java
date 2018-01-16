/*
*조효은, 초보자를 위한 JAVA 200제(서울:정보문화사, 2011), p.321
*객체의 생성과 소멸 주기 정리하기
*/

public class TankMain {
	public static void main(String[] args) {
		System.out.println(Tank.howmany);
		System.out.println(Tank.getHowMany());
		
		Tank tiger=new Tank();
		Tank black=new Tank();
		Tank cats=new Tank();
		Tank hawk=new Tank();
		
		System.out.println(tiger.howfast);//member
		
		tiger.input();		tiger.increase();
		black.input();		black.increase();
		cats.input();		cats.increase();
		hawk.input();		hawk.increase();
		
		tiger.showShortLife();
		tiger.showShortLife();
		System.out.println(Tank.getHowMany());//static 
		System.out.println(tiger.getHowFast());//member
		
		System.out.println(tiger);//type@hashCode
		System.out.println(black);
		System.out.println(cats);
		System.out.println(hawk);
		
		tiger=null;  //garbage collection 대상
		System.out.println(tiger);//type@hashCode
	}
}

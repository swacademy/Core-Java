/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.300
*상속과 부모 메소드 호출
*/

public class SupersonicAirplaneExample {
	public static void main(String[] args) {			
		SupersonicAirplane sa = new SupersonicAirplane();		
		sa.takeOff();
		sa.fly();		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();		
		sa.land();
	}
}


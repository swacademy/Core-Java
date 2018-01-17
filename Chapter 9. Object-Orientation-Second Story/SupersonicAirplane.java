/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.299
*상속과 부모 메소드 호출
*/

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");			
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}


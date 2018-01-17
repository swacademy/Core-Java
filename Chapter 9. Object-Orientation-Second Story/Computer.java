/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.297
*상속과 Method Overriding
*/

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
	System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}



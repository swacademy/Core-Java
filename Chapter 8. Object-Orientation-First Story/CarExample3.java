/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.235
*this
*/

public class CarExample3 {
	public static void main(String[] args) {
		Car3 myCar = new Car3("포르쉐");
		Car3 yourCar = new Car3("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}

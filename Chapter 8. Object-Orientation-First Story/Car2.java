/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.213
*this()
*/

public class Car2 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2() {
	}
	
	Car2(String model) {
		this(model, null, 0);
	}
	
	Car2(String model, String color) {
		this(model, color, 0);
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


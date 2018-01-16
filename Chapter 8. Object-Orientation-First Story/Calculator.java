/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.232
*method overloading
*/

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}	
}


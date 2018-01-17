/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.297
*상속과 Method Overriding
*/

public class ComputerExample {
	public static void main(String[] args) {		
		int r = 10;		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));		
		System.out.println();		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}


/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.262.
*/

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");		
	}
}

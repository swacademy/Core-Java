/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.271.
*/

public class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static long factorial(int n) {
		long result=0;

		if (n == 1) return 1;		

		return n * factorial(n-1); // 메서드 자신을 호출한다.
	}
}

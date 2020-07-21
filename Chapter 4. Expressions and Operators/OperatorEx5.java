/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.97.
*/

public class OperatorEx5 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n",  a, b, a + b);
		System.out.printf("%d - %d = %d\n",  a, b, a - b);
		System.out.printf("%d * %d = %d\n",  a, b, a * b);
		System.out.printf("%d / %d = %d\n",  a, b, a / b);
		System.out.printf("%d / %f = %f\n",  a, (float)b, a / (float)b);
	}
}

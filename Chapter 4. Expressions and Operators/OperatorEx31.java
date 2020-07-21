/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.128.
*/

public class OperatorEx31 {
	public static void main(String[] args) {
		int dec  = 1234; 
		int hex  = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} // main의 끝
}

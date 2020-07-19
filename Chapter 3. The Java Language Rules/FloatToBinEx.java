/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.73.
*/

public class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수로 출력
	} // main의 끝
}

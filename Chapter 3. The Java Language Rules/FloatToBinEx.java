/*
	���ü�, Java�� ����, 3rd Edition(��������, 2016), p.73.
*/

public class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16������ ���
	} // main�� ��
}
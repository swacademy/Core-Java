/*
	���ü�, Java�� ����, 3rd Edition(��������, 2016), p.159.
*/

public class FlowEx13 {
	public static void main(String[] args) { 
		int sum = 0;	// �հ踦 �����ϱ� ���� ����.

		for(int i=1; i <= 10; i++) {
			sum += i ;	//	sum = sum + i;
			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
		}
	} // main�� ��
}

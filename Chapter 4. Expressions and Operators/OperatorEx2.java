/*
	���ü�, Java�� ����, 3rd Edition(��������, 2016), p.94.
*/

public class OperatorEx2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++;
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		j = ++i;
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}
}

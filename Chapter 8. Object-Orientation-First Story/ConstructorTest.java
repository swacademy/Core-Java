/*
	���ü�, Java�� ����, 3rd Edition(��������, 2016), p.292-293.
*/

class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { 	// �Ű������� �ִ� ������.
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();		// compile error�߻�
	}
}

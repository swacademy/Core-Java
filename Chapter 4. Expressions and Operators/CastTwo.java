public class  CastTwo {
	public static void main(String [] args) {
		byte     byte1 ;
		short    short1;
		char     char1 = '\ud55c';
		int      int1;
		float    float1 = 3.6f;

		byte1 = (byte) char1;
		System.out.print("char1 = "+char1 + " =>\t byte1 = "+byte1);
		System.out.println(" => \t(char)"+byte1 +" = "+(char)byte1);

		short1 = (short) char1;
		System.out.print("char1 = "+char1 + " =>\t short1 = "+short1);
		System.out.println(" => \t(char)"+short1 +" = "+(char)short1);

		int1 = char1;
		System.out.print("char1 = "+char1 + " =>\t int1 = "+int1);
		System.out.println(" => \t(char)"+int1 +" = "+(char)int1);

		int1 = (int)float1;       // float(32 bits) => int(32 bits)
		System.out.print("float1 = "+float1 + " => \t int1 = "+int1);
		System.out.println(" => \t(float)"+int1 +" = "+(float)int1);

		short1 = -134;
		byte1 = (byte) short1;
		System.out.println("short1 = "+short1 + " => \t byte1 = "+byte1);

		short1 = -134;
		int1 = short1;
		System.out.println("short1 = "+short1 + " => \t int1 = "+int1);
	}
}
//강제 형 변환
/*
	결과에서 보는 바와 같이 큰 타입에서 작은 타입으로 형 변환시에는 정보를 
	유실할 수 있다. 그리고 short, byte와 char 타입은 서로 값의 범위가 다르기
	때문에 항상 캐스트 연산자를 사용하여야 한다. short 타입에서 byte로 형 
	변환 시 상위 8bits가 없어져 버리는 것에 유의 하여야 한다. 십진수 -134 = 
	이진수 1111111101111010에서 상위 8bits를 제거하면 이진수
	01111010 = 십진수 122이다.
*/
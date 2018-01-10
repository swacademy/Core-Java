/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.80
*/

public class OverflowExample {
	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}


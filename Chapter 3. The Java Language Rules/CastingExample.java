/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.54
*/

public class CastingExample {
	public static void main(String[] args) {	
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
	} 
}

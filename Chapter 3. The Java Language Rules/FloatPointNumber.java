/*
	김병부, 자바를 다루는 기술(서울:(주)도서출판 길벗, 2014). p.60-61.
*/

public class FloatPointNumber{
	public static void main(String[] args){
		char TAB_CHAR = '\t';
		
		float price = 2.99F;
		Double pi = 3.1415926535897D;
		double tax = 0.0299E1;
		
		System.out.println("Variable price" + TAB_CHAR + ": " + price);
		System.out.println("Variable pi" + TAB_CHAR + ": " + pi);
		System.out.println("Variable tax" + TAB_CHAR + ": " + tax);
		
		float maxFloatValue = Float.MAX_VALUE;
		float minFloatValue = Float.MIN_VALUE;
		System.out.println("Maximum value" + TAB_CHAR + ": " + maxFloatValue);
		System.out.println("Minimum value" + TAB_CHAR + ": " + minFloatValue);
		
		System.out.println("Overflow" + TAB_CHAR + ": " + maxFloatValue * 10);
		System.out.println("Underflow" + TAB_CHAR + ": " + minFloatValue / 100);
		
	}
}

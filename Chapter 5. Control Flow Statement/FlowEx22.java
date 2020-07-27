/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.166.
*/

public class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main의 끝
}

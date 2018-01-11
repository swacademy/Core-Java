public class  ArrayTest4{
	public static void main(String[] args) {
		int [] a = {0,1,2,3,4,5,6,7,8,9};
		int [] b = new int[5];
		System.arraycopy(a, 0, b, 0, 5);
		for(int i=0;i<b.length;i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
		//////////////////////////////////바꾼 후/////////////////////////////////
		b[0] = 10000;
		b[1]= 40000;
		for(int i=0;i<a.length;i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}

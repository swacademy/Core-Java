public class  RecursiveCall1{
	public static void main(String[] args) {
		int su = 5;
		int sum = hap(su);
		System.out.println("sum = " + sum);
	}
	static int hap(int n){
		int dab;
		if(n==1) return 1;
		else dab = n + hap(n-1);
		return dab;
	}
}

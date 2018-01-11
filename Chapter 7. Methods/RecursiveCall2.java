//4! = 4 x 3x2x1

public class  RecursiveCall2{
	public static void main(String[] args) {
		int su = 5;
		int dab = fac(su);
		System.out.println(su + "! = " + dab);
	}
	static int fac(int n){
		if(n==1) return 1;
		else return n*fac(n-1);
	}
}

public class  RecursiveCall3{
	public static void main(String[] args) {
		int su = 10;
		int dab = fibonacci(su);
		System.out.println(su + "번째의 값은 " + dab);
	}
	static int fibonacci(int n){
		if(n<=2) return 1;
		else return (fibonacci(n-2) + fibonacci(n-1));
	}
}

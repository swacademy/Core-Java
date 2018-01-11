public class RecursiveCall {
	public static void main(String[] args) {
		display(1);
	}
	static void display(int n){
		System.out.print(n + "\t");
		if(n==5) return;
		else display(n+1);
	}
}

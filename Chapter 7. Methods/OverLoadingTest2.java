public class  OverLoadingTest2{
	public static void main(String[] args) {
		add(4, 8);
		add(4,6);
	}
	static void add(int su, int num){
		System.out.println(su+num);
	}
	static void add(int a, int b){
		System.out.println(a+b);
	}

}

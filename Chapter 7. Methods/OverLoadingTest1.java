public class  OverLoadingTest1{
	public static void main(String[] args) {
		add(4, 8);
		add(4,6,9);
	}
	static void add(int su, int num){
		System.out.println(su+num);
	}
	static void add(int su, int su1, int su2){
		System.out.println(su+su1+su2);
	}

}

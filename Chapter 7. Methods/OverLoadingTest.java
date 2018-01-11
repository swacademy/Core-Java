public class  OverLoadingTest{
	public static void main(String[] args) {
		add(4, 8);
		add(3.4, 5.6);
		add("Hello", "World");
	}
	static void add(int su, int num){
		System.out.println(su+num);
	}
	static void add(double su, double num){
		System.out.println(su+num);
	}
	static void add(String str, String str1){
		System.out.println(str + str1);
	}
}

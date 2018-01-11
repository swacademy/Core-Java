public class  CallByRef{
	public static void main(String[] args) {
		//int a = 5;
		//int b = 7;
		int [] array = {5,7};
		System.out.println("a = " + array[0] + ", b = " + array[1]);
		swap(array);
		System.out.println("바뀐후");
		System.out.println("a = " + array[0] + ", b = " + array[1]);
	}
	static void swap(int [] sample){
		int temp = sample[0];
		sample[0] = sample[1];
		sample[1] = temp;
		System.out.println("su = " + sample[0] + ", num = " + sample[1]);
	}
}

public class DoTest1 {
	public static void main(String[] args) {
		int i, j;
		do{
			i = (int)(Math.random() * 7 + 1);
			j = (int)(Math.random() * 7 + 1);
		}while(i ==j);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}

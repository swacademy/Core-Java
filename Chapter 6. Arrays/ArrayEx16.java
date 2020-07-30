/*
	남궁성, Java의 정석, 3rd Edition(도우출판, 2016), p.212.
*/

public class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);

		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}

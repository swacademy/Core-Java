public class GenericsDemo1 {
	public static void main(String[] args) {
		java.util.Vector vector;
		vector = new java.util.Vector ();
		vector.add("Hello");
		vector.add("World");
		//vector.add(5);  //compile시 발견할 수 없슴

		int size = vector.size();
		for(int i = 0 ; i < size ; i++){
			String str = (String)vector.elementAt(i);
			System.out.println(str);
		}
	}
}

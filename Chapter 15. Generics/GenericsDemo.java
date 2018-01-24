public class GenericsDemo {
	public static void main(String[] args) {
		java.util.Vector <String> vector;
		vector = new java.util.Vector <String> ();
		vector.addElement("Hello");
		vector.addElement("World");
		//vector.addElement(5);  //compile error
		for(String str : vector)
			System.out.println(str);
	}
}

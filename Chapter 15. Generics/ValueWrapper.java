public class ValueWrapper <T> {
	private T value;
	public ValueWrapper(T value){
		this.value = value;
	}
	public T value(){
		return this.value;
	}
	public static void main(String[] args) {
		ValueWrapper <String> sf = new ValueWrapper <String> ("Hello");
		System.out.println(sf.value());

		ValueWrapper <Integer> sf1 = new ValueWrapper <Integer> (5);
		System.out.println(sf1.value());
	}
}

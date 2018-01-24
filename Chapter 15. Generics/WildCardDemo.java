import static java.lang.System.out;

class WildCardDemo<T>{
	T value;
	public WildCardDemo(T value){
		this.value = value;
	}
	public void set(T value){
		this.value = value;
	}
	public T get(){
		return value;
	}

	public static void main(String[] args){
		WildCardDemo<?> wcd = new WildCardDemo<String>("Hello, World");
		String str = (String)wcd.get();
		out.println("String 결과 : " + str);
		WildCardDemo<?> wcd1 = new WildCardDemo<Integer>(10000);
		out.println("Integer 결과 : " + wcd1.get().toString());
	}
}

/*
	WildCard Type 유형으로 객체를 선언하고 생성할 때에는
	반드시 생성자를 객체를 전달해야 함
*/
import static java.lang.System.out;

class WildCardDemo1<T> {
	private T value;
	public WildCardDemo1(){}
	public WildCardDemo1(T value){
		this.value = value;
	}
	public void set(T value){
		this.value = value;
	}
	public T get(){
		return this.value;
	}

	public static void main(String[] args){
		WildCardDemo1<?> wcd = new WildCardDemo1<String>();
		String str = "Hello, World";
		wcd.set((Object)str);
		String str1 = (String)wcd.get();
		out.println("결과 : " + str1);
	}
}

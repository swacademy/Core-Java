import static java.lang.System.out;

class GenericSuperDemo<T>{
	private T value;
	public GenericSuperDemo(T value){
		this.value = value;
	}
	public void set(T value){
		this.value = value;
	}
	public T get(){
		return this.value;
	}

	public static void main(String[] args){
		LionSon son = new LionSon();
		GenericSuperDemo <? super Lion> gud = new GenericSuperDemo <Mammal>(son);
		LionSon son1 = (LionSon)gud.get();
		//LionSon son2 = gud.get();//오류
		out.println("결과 : " + son1.msg + "," + son1.getMsg());
	}
}

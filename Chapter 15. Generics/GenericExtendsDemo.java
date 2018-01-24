import static java.lang.System.out;

class GenericExtendsDemo<T>{
	private T value;
	public GenericExtendsDemo(T value){
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
		GenericExtendsDemo <? extends Lion> ged = new GenericExtendsDemo <LionSon>(son);
		Lion obj = ged.get();
		//LionSon obj1 = ged.get();//오류
		out.println("결과 : " + obj.msg + "," + obj.getMsg());
	}
}

public class Pair <T extends Number> {
	private T v1, v2;
	public Pair(T v1, T v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public T first(){
		return this.v1;
	}
	public T second(){
		return this.v2;
	}
	public static void main(String[] args) {
		Pair <Integer> su = new Pair <Integer> (3,4);
		System.out.println(su.first());
		Pair <Double> d = new Pair <Double>(3.0, 4.0);
		System.out.println(d.second());
	}
}

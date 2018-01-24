
public class ObjectDemo6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 original = new Product1(10);
		Object obj = original.copy();
		Product1 another = original;
		Product1 other = (Product1)obj;
		if(original.equals(other)) System.out.println("original 과 other는 같다");
		if(original.equals(another)) System.out.println("original 과 another는 같다");
	}

}
//clone()을 사용하려면 Cloneable interface를 구현해야 한다.
class Product1 implements Cloneable{
	private int su;
	Product1(int su){ this.su = su; }
	public int getSu() { return this.su;  }
	public Product1 copy(){
		try{
			return (Product1)clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
}
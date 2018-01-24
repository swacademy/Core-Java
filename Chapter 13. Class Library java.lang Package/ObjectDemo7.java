//clone()은 swallow copy를 하기 때문에 값복사를 한다.
public class ObjectDemo7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product2 original = new Product2(10);
		Object obj = original.copy();
		Product2 another = original;
		Product2 other = (Product2)obj;
		System.out.println("**********변경 전***************");
		System.out.println("another.getSu() = " + another.getSu());
		System.out.println("other.getSu() = " + other.getSu());
		System.out.println("**********변경 후***************");
		original.setSu(100);
		System.out.println("another.getSu() = " + another.getSu());
		System.out.println("other.getSu() = " + other.getSu());
	}

}
//clone()을 사용하려면 Cloneable interface를 구현해야 한다.
class Product2 implements Cloneable{
	private int su;
	Product2(int su){ this.su = su; }
	public int getSu() { return this.su;  }
	public void setSu(int su) { this.su = su; }
	public Product2 copy(){
		try{
			return (Product2)clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
}
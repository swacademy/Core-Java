
public class ObjectDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product original = new Product(10);
		Object obj = original.clone();
		if(obj instanceof Product){
			Product other = (Product)obj;
			System.out.println(other.getSu());
		}
	}

}
class Product{
	private int su;
	Product(int su){ this.su = su; }
	protected Object clone() { return this; }
	public int getSu() { return this.su;  }
}
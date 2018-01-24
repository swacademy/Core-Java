public class CloneTest implements Cloneable{
	private String name;
	public CloneTest(String name) { this.name = name; }
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	public static void main(String[] args) {
		CloneTest  t = new CloneTest("Duncan");
		Object obj = null;
		try{
			obj = t.clone();
		}catch(CloneNotSupportedException ex){ 
			System.out.println("Cannot Copy");  
		}
		CloneTest  t1 = (CloneTest)obj;
		if(t == t1) System.out.println("Equals");
		else System.out.println("Not Equals");
		System.out.println(t1.getName());
		t.setName("Michael");
		System.out.println(t1.getName());
	}
}




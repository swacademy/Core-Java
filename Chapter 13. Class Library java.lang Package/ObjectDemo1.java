//toString() : ClassName@hashcode.toString()
public class ObjectDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1("설운도", 30);
		System.out.println(p);
		System.out.println(p.toString());
	}

}
class Person1{
	private String name;
	private int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}
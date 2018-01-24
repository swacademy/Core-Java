//equals()
public class ObjectDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p = new Person3("설운도", 30);
		Person3 p1 = new Person3("설운도", 30);
		Person3 p2 = p;
		System.out.println("p 와 p1 : " + p.equals(p1));
		System.out.println("p 와 p2 : " + p.equals(p2));
	}

}
class Person3{
	private String name;
	private int age;
	
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
}
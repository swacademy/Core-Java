//equals() override
public class ObjectDemo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 p = new Person4("설운도", 30);
		Person4 p1 = new Person4("설운도", 30);
		Person4 p2 = p;
		System.out.println("p 와 p1 : " + p.equals(p1));
		System.out.println("p 와 p2 : " + p.equals(p2));
	}

}
class Person4{
	private String name;
	private int age;
	
	Person4(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj){
		Person4  temp = (Person4)obj;
		if(this.name == temp.name && this.age == temp.age) return true;
		else return false;
	}
}
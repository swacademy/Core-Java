//원하는 형식으로 toString() override
public class ObjectDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2("설운도", 30);
		System.out.println("p = " + p);
		System.out.println("p.toString() = " + p.toString());
	}

}
class Person2{
	private String name;
	private int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다";
	}
}
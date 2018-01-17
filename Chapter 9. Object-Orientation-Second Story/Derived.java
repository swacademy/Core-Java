class Base{
	String name = "Sujan";
	void display(){
		System.out.println("나는 부모의 메소드");
	}
};
public class Derived{
	String name = "Duncan";
	void display(){
		System.out.println("나는 자식의 메소드");
	}
	public static void main(String[] args) {
		//Derived d = new Derived();
		//d.test();
		new Derived().test();
	}
	void test(){
		//System.out.println("name = " + super.name);
		super.display();
	}
}

class Parent{
	String name = "Sujan";
	public void display(){
		System.out.println("나는 부모의 메소드");
	}
};
public class Child extends Parent{
	String name = "Duncan";
	public void display(){
		System.out.println("나는 자식의 메소드");
	}
	public static void main(String[] args) {
		Child  ch = new Child();
		ch.display();
	}
}

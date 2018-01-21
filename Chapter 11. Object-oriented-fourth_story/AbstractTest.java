//error 발생 why?
public abstract class  AbstractTest{
	String name = "Pooh";
	public abstract void display();  //추상메소드
	public String getName(){
		return this.name;
	}
	public static void main(String[] args) {
		System.out.println(new AbstractTest().getName());
	}
}

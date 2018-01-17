class Bumo{
	private String name="Duncan";
	public  void display(){
		System.out.println("name = " + this.name);
	}
};
public class  Jasik extends Bumo{
	public static void main(String[] args) {
		Jasik  ja = new Jasik();
		ja.display();
	}
}

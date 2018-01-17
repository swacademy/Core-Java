class Super{
	String name = "Duncan";
	public void m(){
		System.out.println("나는 부모의 M()");
	}
};
public class  Sub extends Super{
	String name = "Sujan";  //overshadow
	public void m(){  //override
		System.out.println("나는 자식의 M()");
	}
	public static void main(String[] args) {
		Sub s =  new Sub();
		Super su = new Super();
		su = s;
		su.m();

	}
}

public class  This{
	public static void main(String[] args) {
		A  a = new A();
		a.a(10);
	}
}
class A{
	int su;
	B b;
	public A(){
		b = new B();
	}
	void a(int su){
		this.su = su;
		b.doJob(this);
	}
};
class B{
	void doJob(A a){
		System.out.println(a.su);
	}
};
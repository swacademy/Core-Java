
public class ObjectDemo8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.runFinalizersOnExit(true);
		Dog obj = new Dog("1");
		obj = new Dog("2");
		System.gc();
	}
}
class Dog{
	public String myID;
	public Dog(String myID) { this.myID = myID; }
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println("객체가 수거됨 : " + myID);
		System.out.println(Thread.currentThread());
	}
}
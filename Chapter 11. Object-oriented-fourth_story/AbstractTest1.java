abstract class Animal{
	public abstract void saySomething();
};
class EnglishMan extends Animal{
	public void saySomething(){
		System.out.println("Good Morning");	
	}
};
class KoreanWomen extends Animal{
	public void saySomething(){
		System.out.println("안녕하세요");	
	}
};
class Bird extends Animal{
	public void saySomething(){
		System.out.println("짹짹");	
	}
};
public class  AbstractTest1{
	public static void main(String[] args) {
		//new Bird().saySomething();
		new KoreanWomen().saySomething();
	}
}

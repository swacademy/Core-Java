public class ThisTest {
	public static void main(String[] args) {
		EmpInfo  ei = new EmpInfo();
		ei.setName("Sujan");
		ei.printTest();
	}
}
class EmpInfo{
	String name;
	void setName(String name){
		this.name = name;
	}
	void printTest(){
		System.out.println("name = " + this.name);
	}
};
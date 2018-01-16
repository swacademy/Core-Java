public class ObjectTest1 {
	public static void main(String[] args) {
		EmployeeInfo  em = new EmployeeInfo();
		em.name = "Im Hye Jin";
		em.jikwi = "Sajang";
		em.department = "Monster Co.";
		em.printTest();
	}
}
class EmployeeInfo{
	String name;
	String jikwi;
	String department;

	void printTest(){
		System.out.println("name = " + this.name);
		System.out.println("jikwi = " + this.jikwi);
		System.out.println("department = " + this.department);
	}
};
public class ObjectTest {
	public static void main(String[] args) {
		EmployeeInfo sujan = new EmployeeInfo();
		EmployeeInfo soonhee = new EmployeeInfo();
		sujan.name = "Robert Javaman";
		sujan.jikwi = "Manager";
		sujan.department = "Coffee Shop";
		soonhee.name = "Lee Soon Hee";
		soonhee.jikwi = "President";
		soonhee.department = "JavaSoft Company";

		System.out.println(sujan.name + " is " + sujan.jikwi + " at " + sujan.department);
		System.out.println(soonhee.name + " is " + soonhee.jikwi + " at " + soonhee.department);
	}
}
class EmployeeInfo{
	String name;
	String jikwi;
	String department;
};
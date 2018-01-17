/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.295
*상속과 생성자
*/

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}


/*
*신용권, 이것이 자바다(서울:한빛미디어, 2016), p.295
*상속과 생성자
*/

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}


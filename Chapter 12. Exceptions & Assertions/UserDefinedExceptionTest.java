
public class UserDefinedExceptionTest {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Student  철수;
		try{
			철수 = new Student(120);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
class Student{
	private int kor;
	public Student(int kor) throws KoreanException{
		if(kor < 0 || kor > 100) throw new KoreanException("국어점수의 범위 초과");
		else this.kor = kor;
	}
}
class KoreanException extends Exception{
	public KoreanException(String msg){
		super(msg);
	}
}
/*
국어점수의 범위 초과
*/

public class FormatterDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		java.util.Formatter fmt = new java.util.Formatter();
		String name = "Sujan";
		String str = fmt.format("안녕하세요. %s님 %tD는 저의 생일입니다", name, 
				            new java.util.Date()).toString();
		System.out.println(str);
	}
}
/*
안녕하세요. Sujan님 09/26/06는 저의 생일입니다
*/


import java.util.Formatter;
import java.util.Calendar;
public class FormatterDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		System.out.println(fmt.format("%tr", cal));
		fmt = new Formatter();
		System.out.println(fmt.format("%tc", cal));
		fmt = new Formatter();
		System.out.println(fmt.format("%tl : %tM", cal, cal));
		fmt = new Formatter();
		System.out.println(fmt.format("%tB %tb %tm", cal, cal, cal));
	}
}
/*
12:34:36 오전
화 9월 26 00:34:36 KST 2006
12 : 34
9월 9월 09
*/


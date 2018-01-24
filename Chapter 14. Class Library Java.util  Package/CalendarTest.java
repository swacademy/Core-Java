import java.util.*;
import static java.lang.System.out;

public class CalendarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance(Locale.FRANCE);
		//out.println(now);
		out.println("Today is " + 
				now.get(Calendar.YEAR) + "년 " + 
				now.get(Calendar.MONTH) + "월 " + 
				now.get(Calendar.DATE) + "일 입니다");         //month에 주의하자.
	}

}

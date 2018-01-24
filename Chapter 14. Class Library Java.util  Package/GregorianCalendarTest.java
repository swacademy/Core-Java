import java.util.*;
import static java.lang.System.out;

public class GregorianCalendarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = new GregorianCalendar(2004, 1, 1);   //2004-2-01, 윤년
		out.println("2월달의 마지막 날은 : " + now.getActualMaximum(Calendar.DATE));
		now.roll(Calendar.YEAR, 3);
		out.printf("그때부터 3년 뒤의 날 : %tD\n", now);
		now.roll(Calendar.MONTH, 2);
		out.printf("그때부터 2개월 뒤의 날 : %tD\n", now);
	}

}

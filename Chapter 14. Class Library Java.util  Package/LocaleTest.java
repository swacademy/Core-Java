import java.util.*;
import java.text.*;
import static java.lang.System.out;

public class LocaleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		out.println(df.format(new Date()));
	}

}

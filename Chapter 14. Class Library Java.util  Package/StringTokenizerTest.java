import java.util.*;
import static java.lang.System.out;

public class StringTokenizerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String str = now.toString();
		out.println(str); //Thu Apr 25 10:23:56 KST 2007
		StringTokenizer st = new StringTokenizer(str, " ");
		out.println("토큰 갯수 : " + st.countTokens());
		String [] array = new String[st.countTokens()];
		while(st.hasMoreTokens()){
			out.println(st.nextToken());
		}
	}
}

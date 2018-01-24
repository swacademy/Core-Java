import java.util.*;
import static java.lang.System.out;

public class RandomTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(13475);    //할때마다 값이 같음
		for(int i = 0 ; i < 10 ; i++){
			out.println(r.nextInt());
		}
	}
}

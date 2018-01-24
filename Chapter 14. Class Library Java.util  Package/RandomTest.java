import java.util.*;
import static java.lang.System.out;

public class RandomTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();     //할때마다 값이 틀림 
		for(int i = 0 ; i < 10 ; i++){
			out.println(r.nextInt());
		}
	}
}
import java.util.*;
import static java.lang.System.out;

public class HashSetDemo {
    public static void main(String args[]) {

		String[] array = {"Java","Beans","Java","XML"};
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		for (String str : array){
          if (!hs1.add(str))
              hs2.add(str);
		}
		out.println("hs1 : " + hs1);
		hs1.removeAll(hs2);  
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
    }
}

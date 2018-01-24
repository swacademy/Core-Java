import java.util.*;
import static java.lang.System.out;

class MapDemo {
	public static void main(String[] args) {
		String [] array = {"Berlin","Dortmund","Frankfurt", "Gelsenkirchen","Hamburg" };
		HashMap<Integer,String> map = new HashMap<Integer,String>();// HashMap생성
		for(int i = 0 ; i < array.length ; i++)
			map.put(i, array[i]); //맵에 저장

		Set<Integer> keys = map.keySet();
		for(Integer n : keys)
			out.println(map.get(n)); //맵에서 읽어오기
	}
}

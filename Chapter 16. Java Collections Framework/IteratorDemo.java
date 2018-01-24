import java.util.*;
import static java.lang.System.out;

class IteratorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);

		v.add("박지성");
		v.add("박주영");
		v.add("유상철");
		v.add("이미자");
		out.println("벡터크기:" + v.size());

		Iterator<String> it = v.iterator(); // Iterator얻기
		while(it.hasNext()){
			out.println(it.next());
			it.remove(); // 원본 컬렉션에서 요소 삭제
		}
		out.println("벡터크기:" + v.size());
	}
}

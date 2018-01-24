import java.util.*;
import static java.lang.System.out;

public class StackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> stack = new Stack <String>();
		
		String [] array = {"설운도", "이미자", "조성모", "김승현"};
		for(String str : array){
			stack.push(str);     
			out.println("Capacity : " + stack.capacity() + ", size = " + stack.size());
		}
		out.println("첫번째 peek method 결과 : " + stack.peek());
		out.println("두번째 peek method 결과 : " + stack.peek());
		
		out.println("첫번째 pop method 결과 : " + stack.pop());
		out.println("두번째 pop method 결과 : " + stack.pop());
		
		out.println("조성모의 위치 : " + stack.search("조성모"));
		
		while(!stack.empty())
			out.println("POP : " + stack.pop());
	}

}

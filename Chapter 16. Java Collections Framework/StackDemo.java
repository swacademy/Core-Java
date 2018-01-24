import java.util.Stack;
import static java.lang.System.out;

class StackDemo {
	public static void main(String[] args) {
		String [] array = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		Stack<String> stack = new Stack<String>();
		for(String str : array)
			stack.push(str);

		while(!stack.isEmpty())
			out.println(stack.pop());
	}
}

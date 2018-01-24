import java.util.*;
import static java.lang.System.out;

class LinkedListDemo{
	public static void main(String[] args) {
		String[] array = {"Sonata", "Canival", "Tico"};
		LinkedList<String> queue = new LinkedList<String>();

		for(String str : array)
			queue.offer(str);    //전달된 요소를 마지막에 추가
		out.println("Queue의 크기 : " + queue.size());

		String data= "";
		while((data = queue.poll()) != null)     //가장 첫번째 요소를 반환한 후 삭제
			out.println(data + "삭제!");
		out.println("Queue의 크기: " + queue.size());
	}
}

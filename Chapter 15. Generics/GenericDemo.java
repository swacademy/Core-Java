import java.util.*;
import static java.lang.System.out;

class GenericDemo<T> {
	private T [] array;
	public void set(T [] array){
		this.array = array;
	}
	public void print(){
		for(T t : array)
			out.println(t);
	}
}

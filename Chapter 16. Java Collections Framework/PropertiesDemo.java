import java.util.*;
import static java.lang.System.out;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		Enumeration<Object> keys = prop.keys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement().toString();
			out.printf("%s = %s\n", key, System.getProperty(key));
		}
	}
}

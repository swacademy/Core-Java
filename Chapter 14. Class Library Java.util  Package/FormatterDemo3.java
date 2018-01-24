import java.util.Formatter;
public class FormatterDemo3 {
	public static void main(String[] args) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		Formatter fmt = new Formatter("output.txt");
		fmt.format("%f", 123456789.01234);
		fmt.flush();
	}
}
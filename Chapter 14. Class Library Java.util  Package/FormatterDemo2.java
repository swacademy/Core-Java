import java.util.*;
public class FormatterDemo2 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Formatter fmt;
		for(int i=0;i<=10;i++){
			fmt = new Formatter();
			fmt.format("%4d %4d %4d", i, i*i, i*i*i);
			System.out.println(fmt);
		}
	}
}
/*
   0    0    0
   1    1    1
   2    4    8
   3    9   27
   4   16   64
   5   25  125
   6   36  216
   7   49  343
   8   64  512
   9   81  729
  10  100 1000
*/


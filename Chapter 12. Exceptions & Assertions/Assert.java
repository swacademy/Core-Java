import static java.lang.System.out;

class Assert{
	public void gugu(int dan){
		assert dan > 1 && dan < 10 :  "2 ~ 9 단 중 하나를 입력하세요";
		out.println(dan + "단");
		out.println("-----------------------------------------------");
		for(int i = 1 ; i < 10 ; i++){
			out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
}
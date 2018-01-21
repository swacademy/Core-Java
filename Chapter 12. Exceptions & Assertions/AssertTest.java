class AssertTest{
	public static void main(String[] args) {
		assert  args.length > 0 : "\n시작시 인자값이 없습니다. \nUsage : java AssertTest  <args>";
		int i = 0;
		do {
			System.out.println(args[i]);
			i++;
		}while(i < args.length);		
	}
}

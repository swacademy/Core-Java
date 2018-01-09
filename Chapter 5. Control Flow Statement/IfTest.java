public class  IfTest{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		/*if(){
              System.out.println("참");
		}*/
		if(a % 2 == 0){
             System.out.println("짝수");
		}else{
             System.out.println("홀수");
		}
		System.out.println("Program is Over...");
	}
}

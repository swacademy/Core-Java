public class MethodTest {
	public static void main(String[] args) {
		System.out.println("Now Programe is Stared");
		int start = 20;
		int end = 40;
		int aaa = sum(start, end);
		System.out.println("Programe is Over...");
		//sum(50);  //Call By Value
		//sum();   ===>Call By Name
		System.out.println(start + " 부터 " + end + "까지의 합은 = " + aaa);
	}
	static int sum(int start, int end){
		int hap=0;
		for(int i=start;i<=end;i++){
			hap += i;
		}
		if(hap > 0){	return hap;}
		else{ 	return 10;}
	}
}

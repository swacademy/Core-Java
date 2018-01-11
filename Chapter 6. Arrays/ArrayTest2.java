public class ArrayTest2 {
	public static void main(String[] args) {
		int [] su = {1,2,3,4};
		int [] num = new int[6];
		num = su;
		for(int i=0;i<num.length;i++){
			System.out.println("num[" + i + "] = " + num[i]);
		}
		num[0]=10000;
		num[1]=40000;
		for(int i=0;i<su.length;i++){
			System.out.println("su[" + i + "] = " + su[i]);
		}
	}
}

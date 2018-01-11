public class  ArrayTest3{
	public static void main(String[] args) {
		int [] su = {4,5,7,2,};
		int temp;
		for(int i=0;i<(su.length-1);i++){
			for(int j=0;j<(su.length-1);j++){
				if(su[j] < su[j+1]) {
					temp = su[j+1];
					su[j+1] = su[j];
					su[j] = temp;
				}
			}
		}
		for(int i=0;i<su.length;i++){
			System.out.println("su[" + i + "] = " + su[i]);
		}
	}
}

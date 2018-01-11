public class ArrayTest{
	public static void main(String[] args) {
		int [] su = new int[4];
		/*su[0] = 1;
		su[1]= 2;
		su[2]= 3;
		su[3]= 4;*/
		for(int i=0;i<4;i++){
			su[i] = (int)(Math.random()*10+1);
		}
		for(int i=0; i<4;i++){
			System.out.println("su[" + i + "] = " + su[i]);
		}
	}
}

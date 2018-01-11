public class ArrayTest6 {
	public static void main(String[] args) {
		//Ragged Array
		int [][] su = new int[3][];
		su[0] = new int[]{0,1,2};
		su[1] = new int[]{5,6,7,8,9};
		su[2] = new int[]{3,4};
		for(int i=0; i<su.length;i++){
			for(int j=0;j<su[i].length;j++){
				System.out.print("su[" + i+ "][" + j + "] = " + su[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

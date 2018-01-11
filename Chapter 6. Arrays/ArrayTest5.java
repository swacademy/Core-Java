public class ArrayTest5{
	public static void main(String[] args) {
		//int [][] su = new int[3][2];
		int [][] su = {{1,2},{3,4},{5,6}};
		//System.out.println("length = " + su.length);
		for(int i=0;i<su.length;i++){
			for(int j=0;j<su[i].length;j++){
				System.out.print("su[" + i + "][" + j+ "] = " + su[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

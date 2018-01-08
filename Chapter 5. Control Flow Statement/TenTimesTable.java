public class  TenTimesTable{
	public static void main(String[] args) {
		int i=1;
		while(i<=10){
			System.out.print(i*1 + "\t\t");
			int j=2;
			while(j<=10){
				System.out.print(i*j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

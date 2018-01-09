public class  ForTest{
	public static void main(String[] args) {
		int count = 0;
		for(int i=1, int j = 100;i<101;i++){
			if(i % 3==0){   //3의배수라면
				System.out.print(i + "\t");
				 count++;
				 if(count % 4 ==0){
					System.out.println("\n");
				 }
			}
		}
	}
}

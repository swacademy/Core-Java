public class ForTest1 {
	public static void main(String[] args) {
		//1<= i <=100  i=i+2;		 
		//100 <= j <= 1  j = j-3;
		int i, j;
		for(i=1, j=100 ; i<101; ){
			if(i > j){
				System.out.println("i = " + i + ", j = " + j);
				break;
			}
			i +=2;
			j -=3;
		}
	}
}

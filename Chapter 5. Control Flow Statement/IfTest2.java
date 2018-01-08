public class  IfTest2{
	public static void main(String[] args) {
		int kor = 100;
		int eng = 50;
		int mat = 79;
		int tot = kor + eng +  mat;
		double avg = tot / 3.;
		if(90 <= avg && avg <=100){
             System.out.println("A");
		}else if(80 <=avg && avg < 90){
			 System.out.println("B");
		}else if(70 <= avg && avg < 80){
             System.out.println("C");
		}else if(60 <= avg && avg < 70){
             System.out.println("D");
		}else{
             System.out.println("F");
		}
	}
}

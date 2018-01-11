public class  Japanki{
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		int [] array = {10000,5000,1000,500,100,50,10,5,1};
		int mok, na;
		for(int i=0;i<array.length;i++){
			mok = money / array[i];
			System.out.println(array[i] + "원권 " + mok + "장");
			na = money % array[i];
			money = na;
		}
	}
}

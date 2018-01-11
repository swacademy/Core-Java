public class  PassTest{
	double doValue;
	static void changeInt(int a){
		a = 10;
	}
	static void changeStr(String s){
		s = "World";
	}
	static void changeDouble(PassTest  pt){
		pt.doValue = 5.6;
	}
	public static void main(String[] args) {
		String str;
		int su;
		
		PassTest  p = new PassTest();
		p.doValue = 3.4;
		changeDouble(p);
		System.out.println("doValue = " + p.doValue);
	}
}

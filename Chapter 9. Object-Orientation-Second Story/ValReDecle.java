/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.414
*변수의 Override
*/

class AAA {
	public int num=2;
}

class BBB extends AAA{
	public int num=5;
}

class CCC extends BBB{
	public int num=7;
}

class ValReDecle{
	public static void main(String[] args){
		CCC ref1=new CCC();		
		BBB ref2=ref1;
		AAA ref3=ref2;
		
		System.out.println("CCC's ref: "+ref1.num);		
		System.out.println("BBB's ref: "+ref2.num);		
		System.out.println("AAA's ref: "+ref3.num);
	}
}
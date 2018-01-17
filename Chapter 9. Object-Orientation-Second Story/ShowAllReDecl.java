/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.415-416
*/

class AAA {
	public int num=2;
}

class BBB extends AAA{
	public int num=5;
	public void showSuperNum(){
		System.out.println("AAA's num: "+super.num);
	}
}

class CCC extends BBB{
	public int num=7;
	public void showAllNums(){
		super.showSuperNum();
		System.out.println("BBB's num: "+super.num);	
		System.out.println("CCC's num: "+num);
	}
}

public class ShowAllReDecl{
	public static void main(String[] args){
		CCC ref=new CCC();
		ref.showAllNums();
	}
}
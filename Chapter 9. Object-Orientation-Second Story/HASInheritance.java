/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.401-402
*/

class Gun{
	int bullet;    	// 장전된 총알의 수
	
	public Gun(int bnum){bullet=bnum;}
	public void shut(){
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police extends Gun{
	int handcuffs;	     // 소유한 수갑의 수
	
	public Police(int bnum, int bcuff){
		super(bnum);
		handcuffs=bcuff;
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		bullet--;
	}
}

public class HASInheritance{
	public static void main(String[] args)
	{
		Police pman=new Police(5, 3);
		pman.shut();
		pman.putHandcuff();
	}
}
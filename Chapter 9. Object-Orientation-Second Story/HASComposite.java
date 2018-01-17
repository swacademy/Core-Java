/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.402-403
*has a 관계도 상속의 조건은 되지만 복합 관계로 이를 대신하는 것이 일반적이다.
*/

class Gun{
	int bullet;		// 장전된 총알의 수
	
	public Gun(int bnum){bullet=bnum;}
	public void shut(){
		System.out.println("BBANG!");
		bullet--;
	}
}

class Police{
	int handcuffs;	// 소유한 수갑의 수
	Gun pistol;		// 소유하고 있는 권총
	
	public Police(int bnum, int bcuff){
		handcuffs=bcuff;
		if(bnum!=0)
			pistol=new Gun(bnum);
		else
			pistol=null;
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shut(){
		if(pistol==null)
			System.out.println("Hut BBANG!");
		else
			pistol.shut();
	}
}

public class HasComposite{
	public static void main(String[] args){
		Police haveGun=new Police(5, 3);	// 총알 5, 수갑 3
		haveGun.shut();
		haveGun.putHandcuff();
		
		Police dontHaveGun=new Police(0, 3);	// 총알 0, 수갑 3
		dontHaveGun.shut();
	}
}
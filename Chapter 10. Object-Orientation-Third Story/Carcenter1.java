class Car1{};
class Tico1 extends Car1{
	String name = "myTico";
};
class Sonata1 extends Car1{
	String name = "redSonata";
};
class  Canival1 extends Car1{
	String name = "parkCanival";
};
public class Carcenter1{
	public void repair(Car1 c){
		if(c instanceof Tico1){
			Tico1  ti = (Tico1)c;  //부모형을 자식형으로 강제형변환
			System.out.println(ti.name + " 가 잘 수리됐습니다");
		}else if(c instanceof Sonata1){
			Sonata1 so = (Sonata1)c;
			System.out.println(so.name + "가 잘 수리됐습니다");
		}else{
			Canival1 ca = (Canival1)c;
			System.out.println(ca.name + "이 잘 수리됐습니다");
		}
	}
	public static void main(String[] args) {
		Carcenter1 center = new Carcenter1();
		Car1  ti = new Tico1();
		Car1 so = new Sonata1();
		Car1 ca = new Canival1();
		center.repair(ca);
		//center.repair(ti);
		//center.repair(ti);
	}
}
/*
 parkCanival이 잘 수리됐습니다
*/
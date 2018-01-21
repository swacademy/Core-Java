class Car{
	private String name;
	Car(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
};
class Tico extends Car{
	public Tico(String name){
		super(name);
	}
};
class Sonata extends Car{
	public Sonata(String name){
		super(name);
	}
};
class  Canival extends Car{
	public Canival(String name){
		super(name);
	}
};
public class Carcenter{
	public void repair(Car c){
		System.out.println(c.getName() + "이 잘 수리됐습니다");
	}
	public static void main(String[] args) {
		Carcenter center = new Carcenter();
		//heterogeneous Collection
		Car [] car = {new Tico("myTico"), new Sonata("yellowSonata"),  new Canival("parkCanival")};
		for(int i=0;i<car.length;i++){
			center.repair(car[i]);
		}
	}
}
/*
myTico이 잘 수리됐습니다
yellowSonata이 잘 수리됐습니다
parkCanival이 잘 수리됐습니다
*/
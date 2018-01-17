//다단계 상속
public class MultiInheritanceDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Son s = new Son(10,20,30,10,100);
		Son s1 = new Son(2,4,6,8,50);
		
		double volume;
		volume= s.volume();
		System.out.println("Son의 부피 : " + volume);
		System.out.println("Son의 무게 : " + s.weight);
		System.out.println("Son의 비용 : " + s.cost);
		
		System.out.println();
		
		volume = s1.volume();
		System.out.println("Son1의 부피 : " + volume);
		System.out.println("Son1의 무게 : " + s1.weight);
		System.out.println("Son1의 비용 : " + s1.cost);
	}

}
class GrandFather{
	private double width, height, depth;
	
	GrandFather(double width, double height, double depth){  //생성자
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	double volume(){
		return width * height * depth;
	}
}
//무게 변수 추가한 클래스
class Father extends GrandFather{
	double weight;
	Father(double width, double height, double depth, double weight){  //생성자
		super(width, height, depth);  //수퍼클래스 생성자 호출
		this.weight = weight;
	}
}
//비용을 추가한 클래스
class Son extends Father{
	double cost;
	Son(double width, double height, double depth, double weight, double cost){
		super(width, height, depth, weight);  //바로 위의 부모인 Father의 생성자 호출
		this.cost = cost;
	}
}
/*
Son의 부피 : 6000.0
Son의 무게 : 10.0
Son의 비용 : 100.0

Son1의 부피 : 48.0
Son1의 무게 : 8.0
Son1의 비용 : 50.0
*/
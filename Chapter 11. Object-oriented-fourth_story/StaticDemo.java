/*
 * 일반 멤버변수는 객체를 만들때마다 새로 만들어진다. 따라서 항상 초기값은 0이된다.
 * 하지만, static 변수는 객체밖에 만들어 져서 객체끼리 공유하기 때문에 갯수는 한개만 만들어지고
 * 값은 항상 유지된다. 
 */
public class StaticDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Count [] array = new Count[4];
		for(int i=0;i<array.length;i++){
			array[i] = new Count();    //한꺼번에 Count Class 생성
 		}
		for(int i=0;i<array.length;i++){
			array[i].display();             //한꺼번에 출력하기
		}
	}
}
class Count{
	private int serialNumber;   //memeber variable
	static int count;   //static variable
	public Count(){   //default constructor
		count++;
		serialNumber = count;
	}
	public void display(){
		System.out.printf("serialNumber = %d, count = %d\n", serialNumber, count);
	}
}
/*
serialNumber = 1, count = 4
serialNumber = 2, count = 4
serialNumber = 3, count = 4
serialNumber = 4, count = 4
*/
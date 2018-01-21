/*
 * static variable은 한개만 생성
 * member variable은 각 객체당 1개씩, 모두 4개가 생성
 */
public class StaticDemo1 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Count1 [] array = new Count1[4];
		for(int i=0;i<array.length;i++){
			array[i] = new Count1();    //한꺼번에 Count Class 생성
 		}
		for(int i=0;i<array.length;i++){
			array[i].display();             //한꺼번에 출력하기
		}
	}
}
class Count1{
	private int serialNumber;   //memeber variable
	static int count;   //static variable
	public Count1(){   //default constructor
		count++;
		serialNumber++;
	}
	public void display(){
		System.out.printf("serialNumber = %d, count = %d\n", serialNumber, count);
	}
}
/*
serialNumber = 1, count = 4
serialNumber = 1, count = 4
serialNumber = 1, count = 4
serialNumber = 1, count = 4
*/
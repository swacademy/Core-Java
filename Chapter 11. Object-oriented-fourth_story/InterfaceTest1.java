interface XYZ{
	void xyz();
}
interface YZW{
	void yzw();
}
interface ABC extends XYZ,YZW{  //4. interface끼리도 상속할 때는 extends사용, 이때 다중상속 가능
	void abc();                                     
	int a = 5;
}
interface DEF{
	void def();
	int a = 10;
}
public class  InterfaceTest1 implements ABC, DEF{  //5. interface는 다중상속가능
	public void xyz(){ System.out.println("Called by xyz()");  }
	public void yzw(){ System.out.println("Called by yzw()"); }
	public void abc(){ System.out.println("Called by abc()"); }
	public void def(){ System.out.println("Called by def()");  }
	public static void main(String[] args) {
		InterfaceTest1  it = new InterfaceTest1();
		XYZ  xYz = new InterfaceTest1(); //자식이 부모형으로 형변환
		xYz.xyz();
		YZW  yZw = it;
		yZw.yzw();
		ABC [] array = new ABC[3];  //6. interface도 배열을 생성가능
		array[0] = new InterfaceTest1();
		array[0].abc();
		System.out.println("a= " + DEF.a);    //7. interface 속의 상수의 이름이 같을 때 접근법
	}
}

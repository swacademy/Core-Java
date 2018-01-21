//#include<stdio.h>

//import  abc.temp.A;    //abc\temp\A.class(windows방식)
//import abc.temp.B;     //abc/temp/A.class(Unix방식)
import abc.temp.*;
import java.lang.*;
public class  PackageTest{
	public static void main(String[] args) {
		A  a = new A();
		B  b = new B();
		a.display();
		b.display();
	}
}

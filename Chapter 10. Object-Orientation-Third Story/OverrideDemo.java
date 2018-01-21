import java.io.*;
public class OverrideDemo {
	void showMenu(){
		System.out.println("***************재밌는게임**************");
		System.out.println("당신은 어느 종족이십니까? 아래 번호를 정확히 입력해 주세요");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Korean");
		System.out.println("4. American");
		System.out.println("5. Japanese");
	}
	char input() throws IOException{
		char choice;
		System.out.print("자! 당신의 종족은? ==> ");
		choice = (char)System.in.read();
		return choice;
	}
	Mammal output(Mammal m, char ch){
		switch(ch){
			case '1':  m = new Dog(); break;
			case '2':  m = new Cat(); break;
			case '3':  m = new Korean(); break;
			case '4':  m = new American(); break;
			case '5':  m = new Japanese() ; break;
			default :  System.out.println("잘못된 값입니다.");
		}
		return m;
	}
	public static void main(String[] args) throws IOException{
		// TODO 자동 생성된 메소드 스텁
		Mammal m = new Mammal();
		OverrideDemo od = new OverrideDemo();
		od.showMenu();
		char ch = od.input();
		m = od.output(m, ch);
		m.saySomething();
	}
}
/*
***************재밌는게임**************
당신은 어느 종족이십니까? 아래 번호를 정확히 입력해 주세요
1. Dog
2. Cat
3. Korean
4. American
5. Japanese
자! 당신의 종족은? ==> 5
곤니찌와
*/
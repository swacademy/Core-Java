public class  SwitchTest{
	public static void main(String[] args) {
		int born_year = Integer.parseInt(args[0]);
		System.out.println("당신의 나이는 " + (2002-born_year + 1) + "살 이구요");
		//자축인묘진사오미신유술해
		switch((2002-born_year) % 12){
			case 0: System.out.println("말띠이네요");  break;
			case 1: System.out.println("뱀띠이네요");  break;
			case 2: System.out.println("용띠이네요");  break;
			case 3: System.out.println("토끼띠이네요");  break;
			case 4: System.out.println("범띠이네요");  break;
			case 5: System.out.println("소띠이네요");  break;
			case 6: System.out.println("쥐띠이네요");  break;
			case 7: System.out.println("돼지띠이네요");  break;
			case 8: System.out.println("개띠이네요");  break;
			case 9: System.out.println("닭띠이네요");  break;
			case 10: System.out.println("원숭이띠이네요");  break;
			default : System.out.println("양띠이네요"); 
		}
	}
}

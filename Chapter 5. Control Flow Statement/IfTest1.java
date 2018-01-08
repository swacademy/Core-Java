public class  IfTest1{
	public static void main(String[] args) {
		String str = args[0].trim();
		System.out.println("str = " + str);
		if(str.equals("봄")){
			System.out.println("진달래, 개나리");
		}else if(str.equals("여름")){
			System.out.println("아카시아, 장미");
		}else if(str.equals("가을")){
			System.out.println("국화, 백합");
		}else{
            System.out.println("동백, 매화");
		}
	}
}

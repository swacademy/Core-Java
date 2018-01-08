public class  SwitchTest1{
	public static void main(String[] args) {
		int tot = 100;
		switch((int)((tot/5.)/10)){
			default:System.out.println("F"); break;
			case 10: 
			case 9:System.out.println("A"); break;
			case 8:System.out.println("B"); break;
			case 7:System.out.println("C"); break;
			case 6:System.out.println("D"); break;
			
		}
	}
}

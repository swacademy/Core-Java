public class  SwitchTest2{
	public static void main(String[] args) {
	/*	(int)1.0 <= (int)(Math.random()*10 + 1) < (int)11.0
		1 <= (int)(Math.random()*10 + 1) < 11
		syntax>  (int)(Math.random() * max + min)
	*/
	int su = (int)(Math.random() * 10 + 1);
	System.out.println("su = " + su);
	switch(su){
		case 1: System.out.println("Bananas"); break;
		case 2: System.out.println("Oranges"); break;
		case 3: System.out.println("Pears"); 
		case 4: System.out.println("Apples");
		case 5: System.out.println("Plums"); break;
		case 6: System.out.println("PineApples"); break;
		case 7: System.out.println("No message"); break;
		default: System.out.println("Nuts"); 
	}
	}
}

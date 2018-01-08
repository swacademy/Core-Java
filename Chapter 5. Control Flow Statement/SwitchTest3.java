public class SwitchTest3 {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		char ch = args[2].charAt(0);
		switch(ch){
			case '+' : System.out.println(first + " + " + second + " = " + (first+second)); break;
			case '-' : System.out.println(first + " - " + second + " = " + (first-second)); break;
			case 'x' : System.out.println(first + " x " + second + " = " + (first*second)); break;
			case '/' : System.out.println(first + " / " + second + " = " + (first/second)); break;
			case '%' : System.out.println(first + " % " + second + " = " + (first%second)); break;
			default : System.out.println("Error : Please Insert Again"); 
		}
	}
}

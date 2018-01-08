public class IfTest3 {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		char ch = args[2].trim().charAt(0);
		System.out.println("ch = " + ch);
        if(ch == '+'){
			System.out.println(first + " + " + second + " = " + (first+second));
		}else if(ch == '-'){
			System.out.println(first + " - " + second + " = " + (first-second));
		}else if(ch == 'x'){
			System.out.println(first + " * " + second + " = " + (first*second));
		}else if(ch == '/'){
			System.out.println(first + " / " + second + " = " + (first/second));
		}else{
			System.out.println(first + " % " + second + " = " + (first%second));
		}
	}
}

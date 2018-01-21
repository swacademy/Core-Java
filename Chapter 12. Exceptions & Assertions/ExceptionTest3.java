//Multiple Catch Block
public class  ExceptionTest3{
	public static void main(String[] args) {
		int i=0;
		String [] array = {"Hello", "World","GoodMorning"};
		while(i<4){
			try{
				System.out.println("array[" + i + "] =" + array[i]);
			}catch(ArithmeticException e){
				System.out.println("Program is Over...");
			}catch(NegativeArraySizeException e){
				System.out.println("NegativeArraySizeException");
			}catch(NullPointerException e){
				System.out.println("NullPointerException");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("나야");
			}

			i++;
		}
	}
}
/*
array[0] =Hello
array[1] =World
array[2] =GoodMorning
나야
*/
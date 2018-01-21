public class  ExceptionTest5{
	public static void main(String[] args) {
		int i=0;
		String [] array = {"Hello", "World","GoodMorning"};
		while(i<4){
			try{
				System.out.println(array[i]);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("그래도 나는 찍는다");
			}
			i++;
		}
	}
}
/*
Hello
그래도 나는 찍는다
World
그래도 나는 찍는다
GoodMorning
그래도 나는 찍는다
그래도 나는 찍는다
java.lang.ArrayIndexOutOfBoundsException: 3
	at ExceptionTest5.main(ExceptionTest5.java:7)
*/
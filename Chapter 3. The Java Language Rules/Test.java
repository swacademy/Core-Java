public class Test{
      public static void main(String [] args){
            int first, second;
            first = 7;
            second = first;
            System.out.println("first = " + first);
            System.out.println("second = " + second);

            System.out.println("값 변환 후");
            second = 10;
            System.out.println("first = " + first);
            System.out.println("second = " + second);            
      }
}
public class OperatorTest{
      public static void main(String [] args){
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);
            System.out.println("first = " + first);                   
            System.out.println("second = " + second);
System.out.println(first + " + " + second + " = " + (first + second));
System.out.println(first + " - " + second + " = " + (first - second));
System.out.println(first + " X " + second + " = " + (first * second));
System.out.println(first + " / " + second + " = " + (first / second));
System.out.println(first + " % " + second + " = " + (first % second));
      }
}
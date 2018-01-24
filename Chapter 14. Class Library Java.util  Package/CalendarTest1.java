import java.util.*;
public class  CalendarTest1{
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]) - 1;
		int day = 1;
		Calendar  date = new GregorianCalendar(year, month,day);
		int space = date.get(Calendar.DAY_OF_WEEK) -1 ;
		int maxDay = date.getActualMaximum(Calendar.DATE);
		System.out.println("================" + year + ":" + (month+1) + "================");
		System.out.println("----------------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------------");
		int count=0;
		///////////////////////////공백찍기//////////////////////////////////////////
		for(int i=0;i<space ; i++){
			System.out.print("★\t");
			count++;
		}
		////////////////////////////1부터 maxDay까지////////////////////////
		for(int i=1;i<=maxDay; i++){
			System.out.print(i + "\t");
			count++;
			if(count%7==0){
				System.out.println();
				count=0;
			}
		}
		//////////////////////////////마지말 줄 별찍기/////////////////////
		for(int i=0;i<(7-count);i++){
			System.out.print("★\t");
		}
		System.out.println();
		System.out.println("Program is Over...");

	}
}

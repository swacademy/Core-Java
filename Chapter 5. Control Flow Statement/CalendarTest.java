class CalendarTest{
     public static void main(String [] args){
           int year = Integer.parseInt(args[0]);
           int month = Integer.parseInt(args[1]);
           int day = 1;
           int hap=0;
//////////////////////////////////년까지의 총 날수////////////////////////////////////
           for(int i=1;i<year;i++){
/*
윤년알고리즘
  1. year%400==0
  2. (year%4==0) && (year%100!=0)
*/
              if((i%400==0) || ((i%4==0) && (i%100!=0))){  //윤년이라면
                    hap +=366;
              }else{  //윤년이 아니라면
                    hap +=365;
              }
          }
////////////////////////////월을 이용한 날수계산하기////////////////////////////////
              if((year%400==0) || ((year%4==0) && (year%100!=0))){  //올해가 윤년이라면  
                   int [] test={31,29,31,30,31,30,31,31,30,31,30,31};
                   for(int i=0;i<(month-1);i++){
                         hap +=test[i];
                   }
              }else{  //올해가 윤년이 아니라면
                   int [] test1={31,28,31,30,31,30,31,31,30,31,30,31};
                   for(int j=0;j<(month-1);j++){
                         hap +=test1[j];
                   }
              }
//////////////////////////////일을 이용한 총 날수 계산하기/////////////////////////////
              for(int i=1;i<=day;i++){
                    hap++;
              }
              int space=0;
              switch(hap%7){
                   case 0:space=0;break;
                   case 1:space=1;break;
                   case 2:space=2;break;
                   case 3:space=3;break;
                   case 4:space=4;break;
                   case 5:space=5;break;
                   default:space=6;
              }
////////////////////////////////////maxDay알기////////////////////////////////////////
             int maxDay=0;
             switch(month){
                case 1: maxDay=31; break;
                case 2: 
	   if((year%400==0) || ((year%4==0) && (year%100!=0))){
                        maxDay=29; break;
                   }else{
                        maxDay = 28; break;
                   }
                case 3: maxDay=31; break;
                case 4: maxDay=30; break;
                case 5: maxDay=31; break;
                case 6: maxDay=30; break;
                case 7: maxDay=31; break;
                case 8: maxDay=31; break;
                case 9: maxDay=30; break;
                case 10: maxDay=31; break;
                case 11: maxDay=30; break;
                default: maxDay=31; 
             }
//////////////////////////////////////////달력찍기////////////////////////////////////////////////
             int count=0;
             System.out.println("***********************" + year + " : " + month + "*****************************");
             System.out.println("=========================================================");
             System.out.println("日\t月\t火\t水\t木\t金\t土");
             System.out.println("---------------------------------------------------------");
             for(int i=0;i<space;i++){
                   System.out.print("★\t");
                   count++;
             }
             for(int i=1;i<=maxDay;i++){
	   System.out.print(i + "\t");
                   count++;
                   if(count%7==0){
                          System.out.println();
                          count = 0;
                   }
             }
             if(count!=0){
                 for(int i=0;i<(7-count);i++){
                     System.out.print("★\t");
                 }
             }
             System.out.println();
             System.out.println("Program is Over..");
     }
}








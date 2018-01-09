class GuGuDan{
   public static void main(String [] args){
        for(int i=1; i<=9;i++){   //i는 피승수
            for(int j=2 ;j<=9; j++) {        //j는 승수(단)              
               System.out.print(j + "X" + i + "=" + j*i  + "\t");
            }
            System.out.println();
        }
   }
}

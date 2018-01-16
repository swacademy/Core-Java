public class  ConstructorTest{
	public static void main(String[] args) {
		DateTest  today = new DateTest();
		DateTest  yesterday = new DateTest(2002,9,4);
		today.display();
		yesterday.display();
	}
}
class DateTest{
	int year;
	int month;
	int day;
	public DateTest(){
		year = 2002;
		month = 9;
		day = 5;
	}
	public DateTest(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	void display(){
		System.out.println("year = " + year + ", month= " + month + ", day=" + day);
	}
};
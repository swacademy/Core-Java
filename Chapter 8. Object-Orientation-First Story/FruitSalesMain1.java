/*
*윤성우, 난 정말 JAVA를 공부한 적이 없다구요!(서울:오렌지미디어, 2012), p.186-187
*/

class FruitSeller{
	int numOfApple=20;
	int myMoney=0;
	final int APPLE_PRICE=1000;
	
	public int saleApple(int money){
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult(){
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
} 

class FruitBuyer{
	int myMoney=5000;
	int numOfApple=0;
	
	public void buyApple(FruitSeller seller, int money){
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult(){
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);		
	}
}

public class FruitSalesMain1{
	public static void main(String[] args){
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);
		
		System.out.println("과일 판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}
}
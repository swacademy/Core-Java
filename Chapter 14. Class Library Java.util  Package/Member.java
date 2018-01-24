public class Member extends java.util.Observable {
	int count = 0;
	void register(String id){
		count++;
		if( count == 5){
			setChanged();
			notifyObservers(id);
		}else{
			try{
				Thread.sleep(1000);
				System.out.println("count = " + count);
			}catch(Exception e){}
		}
	}
}



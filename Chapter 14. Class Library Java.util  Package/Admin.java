import java.util.*;
import java.util.Observer;
public class Admin implements Observer {
	public void update(Observable arg0, Object arg1) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("update() 호출, " + arg1 + 
				        "님이 5번째 회원으로 가입했습니다");
		System.out.println("가입 일시 : " + new Date());
	}
}
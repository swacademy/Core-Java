public class ObserverDemo {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Member member = new Member();
		Admin admin = new Admin();
		member.addObserver(admin);
		for(int i=0;i<10;i++){
			member.register("id_" + i);
		}
	}
}
/*
count = 1
count = 2
count = 3
count = 4
update() 호출, id_4님이 5번째 회원으로 가입했습니다
가입 일시 : Mon Sep 25 23:46:42 KST 2006
count = 6
count = 7
count = 8
count = 9
count = 10
*/


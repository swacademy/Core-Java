public class  Password{
	public static void main(String[] args) {
		char [] pass = {'A','B','C','D'};
		String userPass = args[0].trim();
		char [] test = new char[4];
		int i;
		for(i=0;i<4;i++){
			test[i] = userPass.charAt(i);
		}
		for(i=0;i<4;i++){
			if(pass[i] == test[i]) continue;  //같으면 i++
			else break;   //틀리면 break;
		}
		if(i == 4) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");

	}
}

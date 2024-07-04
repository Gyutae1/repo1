package sec04.exam10;

public class Login {
	
	String id;
	String pw;
	boolean loGin;
	
	Login(String x,String y){
		id = x;
		pw = y;
	}
	
//	void join(String x,String y) {
//		id = x;
//		pw = y;
//	}
	
	void login(String x,String y) {
		if(id == x && pw == y) {
			System.out.println("메인페이지");
			loGin = true;
		} else {
			System.out.println("로그인 화면으로 돌아감");
			loGin = false;
		}
	}
}

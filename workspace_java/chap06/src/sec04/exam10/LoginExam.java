package sec04.exam10;

public class LoginExam {

	public static void main(String[] args) {
		Login login = new Login("asdf", "123");
		
		login.login("asdf", "123");
		login.login("asdf", "1234");
	}
}

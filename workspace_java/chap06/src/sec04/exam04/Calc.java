package sec04.exam04;

public class Calc {
	int Plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x,int y) {
		double sum = Plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		Println("실행결과:" + result);
	}
	
	void Println(String message) {
		System.out.println(message);
	}
}

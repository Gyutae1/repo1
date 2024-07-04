package sec04.exam08;

public class Calc {
		// 1단계
	int add(int x, int y) {
		System.out.println(x + y);
		return x + y;
		
	}
	
	int sub(int x, int y) {
		System.out.println(x - y);
		return x - y;
	}
	
	int mul(int x, int y) {
		System.out.println(x * y);
		return x*y;
	}
		
	double div(int x, int y) {
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		} else {
			System.out.println(x/(double) y);
		return x/(double) y;
		}
	}
	int rem(int x,int y) {
		System.out.println(x % y);
		return x%y;
	}
		// 2단계
	void calculate(int x,String p1,int y) {
		if(p1 == "+") {
			add(x,y);
			
		} else if(p1 == "-") {
			sub(x,y);
			
		} else if(p1 == "*") {
			mul(x,y);
			
		} else if(p1 == "/") {
			div(x,y);
			
		} else if (p1 == "%") {
			rem(x,y);
		}
	}
}

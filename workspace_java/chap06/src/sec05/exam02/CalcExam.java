package sec05.exam02;

public class CalcExam {
	
	// 자바가 즉 java.exe가 특정 클래스를 실행할때
	// 예를 들어 CalcExam 클래스를 실행할때
	// CalcExam.main(스트링배열)을 실행한다
	public static void main(String[] args) {

		Calc c1 = new Calc();
		Calc c2 = new Calc();
		
		c1.color = "빨강";
		c2.color = "파랑";
		System.out.println(Calc.pi);
		System.out.println(c1.pi);
		c1.pi = 3.14;
		
		System.out.println(Calc.pi);
		System.out.println(c1.pi);
		Calc.test();
	}
}

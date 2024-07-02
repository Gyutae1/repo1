package sec04.exam;

public class CalcExam {

	public static void main(String[] args) {
		powerOn();
		powerOn();
		Calc calc = new Calc();
		calc.PowerOff();
		System.out.println(calc);
		Calc calc2 = new Calc();
		System.out.println(calc2);
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
}

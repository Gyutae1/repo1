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
		
		
		Calc calc3 = new Calc();
		calc3.PowerOn();
		int result = calc3.Plus(3, 8);
		System.out.println(result);
		
		System.out.println(calc.divide(12,0));
		
		int[] a = {2, 7};
		
		System.out.println(calc3.Plus2(a));
		
		int num = calc.Plus3(1,2,3,4,5,3,4,1,2,3);
		System.out.println("plus3 :"+num);
		
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
}

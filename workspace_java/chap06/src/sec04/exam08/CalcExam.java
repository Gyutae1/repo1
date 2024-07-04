package sec04.exam08;

public class CalcExam {

	public static void main(String[] args) {
		Calc calc =  new Calc();
		calc.add(3, 4);
		calc.div(4, 3);
		calc.rem(5, 3);
		calc.calculate(4, "*", 3);
		calc.calculate(4, "/", 3);
		calc.calculate(4, "+", 3);
		calc.calculate(4, "%", 3);
	}

}

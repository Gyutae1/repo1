package chap04;

public class rrr {

	public static void main(String[] args) {
		// 구구단
		// 2단 출력
		for (int q = 1;q <= 9; q++) {
			System.out.println("2*" +q+ "="+ (2*q));
		}
		
		for (int f =1; f <= 9; f++) {
			
			System.out.println("----"+f+"단-----");
			for (int q = 1;q <= 9; q++) {
				System.out.println(f + " * " +q+ " = "+ (f*q));
			}
		}
		
		
		
		
		for (int a =1 ; a <= 9; a++) {
			System.out.println(a + "단");
			for (int b=1 ; b <= 9; b++) {
				System.out.println(a + "*"+ b +"="+ a*b);
			}
		}
		
		
		
		
		
		
		
		
	}
	
}

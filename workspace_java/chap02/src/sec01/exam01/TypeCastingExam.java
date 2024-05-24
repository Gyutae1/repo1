package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {
		
		int a = 10;
		long b = (long)a; // int 인 a를 long 타입으로 바꿔라
						   // long이 long 타입에 들어가는건 문제가 안된다
		long c = a; // 작은거에서 큰걸로 바뀔때는 손실이 없으므로
					// 형변환을 생략할 수 있다
					// 자동 형변환
					// 암시적, 묵시적, 암묵적으로 형변환
		System.out.println(c);
		
		a = (int) c; // 큰거에서 작은거로 바뀔때는 손실이 있을 수 있다
					 // 형변환을 생략할 수 없다
					 // 명시적, 강제 형변환
		long d = 3000000000L;
		int a2 = (int) d;
		System.out.println("a2 :" + a2);
		
		double d2 = 3.14;
		int i = (int)d2;	// 예상가능해서 많이 쓰는 스킬
		System.out.println("i :" + i);
		
//		int result = 43;
		double result = 43;
		int count = 10;
		System.out.println((double)count);
		System.out.println( result / (double)count);
		System.out.println( result / count);
		//double과 int 연산할때 int가 double로 자동 형변환돼서 연산됨
		
		int i2 = 2100000000;
		int i3 = i2 * 2;	// int끼리 연산해서 java는 문제 없다고 생각한다
		System.out.println("i3 :"+ i3); // 결과가 -94967296 > 넘쳐서 그렇다
		
		System.out.println( 3 + "문자");
		System.out.println( 3 + 4 + "문자");
		System.out.println( ""+ 1+ 300 + "px");
		System.out.println( ""+ (1+ 300) + "px");
		
		System.out.println("-----------------");
		
		System.out.print("첫번째줄");
		System.out.print("두번째줄");
		
		System.out.printf("i3의 값은 : %d", i3);		
		System.out.println();
		System.out.printf("i3의 값은 : %d", i3);		
		System.out.println();
		System.out.printf("i2의 값은 : %d, i3: %d", i2, i3);		
		System.out.println("-----------------");

		
		System.out.println("아무거나 입력하세요...");
		Scanner scan = new Scanner(System.in); //입력 받으려고 준비
		String input = scan.nextLine();
		System.out.println("input : "+ input);
	}

}

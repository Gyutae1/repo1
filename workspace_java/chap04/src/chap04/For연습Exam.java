package chap04;

import java.util.Scanner;

public class For연습Exam {

	public static void main(String[] args) {

//		//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int a = scan.nextInt();
////		int a = -3;
//		
//		if (a < 0) {
//			System.out.println("음수");
//		} else if ( a >= 0) {
//			System.out.println("양수");
//		}
		
		
		/*for(int i=1; i<=3;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int a = scan.nextInt();
//			int a = -3;
			
			if (a < 0) {
				System.out.println("음수");
			} else {
				System.out.println("양수");
			}
		}*/
		
		//입력받은 숫자가 0이 아닌 동안 계속 반복
		
//		for (int a = 1 ;a !=0 ;) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("숫자를 입력하세요(종료:0)");
//			a = scan.nextInt();
//			
//			if (a < 0) {
//				System.out.println("음수");
//			} else {
//				System.out.println("양수");
//			}
//		}
//		System.out.println("종료되었습니다");
		
		
		/*
		 *
		 */
		for (int w =1 ; w <=5 ; w++) {
			System.out.println("+");
		}
		
			
		System.out.println("1단계");
		for (int w =1 ; w <=5 ; w++) {
			System.out.print("+");
		}
		System.out.println();
		
		System.out.println("2단계");
		for (int e =1 ; e <=3 ; e++) {
			System.out.println();
			for (int w =1 ; w <=5 ; w++) {
				System.out.print("+");
			}
		}
		
		System.out.println();
		for (int w =1 ; w <=5 ; w++) {
			System.out.print("+");
			System.out.print(".");
		}
		
		System.out.println();
		
		System.out.println("3단계");
		
		for (int e = 1; e <=5; e++) {
			System.out.println();
			for (int w = 1; w <= e; w++ ) {
//				System.out.println(w);
				System.out.print("+");
			}
		}
		
		System.out.println();
		System.out.println("4단계");
		
		for (int e = 0; e <=4; e++) {
			System.out.println();
			for (int w = 0; w <= 4; w++ ) {
				if (w <= e) {
					System.out.print("+");
				} else {
					System.out.print(".");
				}
				
			}
		}
		
		System.out.println();
		System.out.println("5단계");
		
		for (int e = 4; 0 <= e ; e--) {
			System.out.println();
			for (int w = 0; w <= 4; w++ ) {
				if (w < e) {
					System.out.print(".");
					
				} else if (w >= e) {
					System.out.print("+");
				}
				
			}
		}
		
		System.out.println();
		System.out.println("6단계");
		
		for (int e = 4; 0 <= e ; e--) {
			System.out.println();
			for (int w = 0; w <= 4; w++ ) {
				if (w < e) {
					System.out.print(".");
					
				} else if (w == e) {
					System.out.print("+");
				} else {
					System.out.print("++");
				}
				
			}
		}
		
		System.out.println();
		System.out.println("7단계");
		
		for (int e = 4; 0 <= e ; e--) {
			System.out.println();
			int g = 4;
			g = g++;
			for (int w = 0; w <= 8; w++ ){
				if (w < e) {
					System.out.print(".");
				} else if ( w > e){
					System.out.print(".");
				} else if ( w <= g ){
					System.out.print("+");
				}
			}
		}
		
		System.out.println();
		System.out.println("구구단");
		
		for (int p = 2; p <=9; p++) {
			for (int o = 1; o <=9; o++) {
				System.out.print(p+"*"+o+"="+(p*o)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("구구단2단계");
		
		for (int p = 1; p <=9; p++) {
			for (int o = 2; o <=9; o++) {
				if (o <= 3) {
				System.out.print(o+"*"+p+"="+(o*p)+" ");
				}
				else if (o == 4) {
					System.out.println(o+"*"+p+"="+(o*p)+" ");//포문바깥에 ln 박고 해보자
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println("주사위 1단계");
		
		for (int d = 1; d <= 6; d++) {
			for (int d2 = 1; d2 <= 6; d2++) {
			System.out.println(d + "+" +d2 +"=" + (d + d2));
			}
		}
		System.out.println();
		System.out.println("주사위 2단계");
		
		for (int d = 1; d <= 6; d++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				for (int y = (d+d2); y <= 12; y++) {
					if (y==2) {
						System.out.println("합이"+y+":"+d+","+d2);
					} else if (y==3) {
						System.out.println("합이"+y+":"+d+","+d2);
					} 
				}
			}
		}
		
		
		
		
		
		
	}
}

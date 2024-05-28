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
					
				} else if (w >= e) {
					System.out.print("+");
				} 
				
			}
		}
	}

}

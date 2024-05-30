package chap04;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		// 은행 계좌의 잔액 관리 시스템
		// 1.입금, 2.출금, 3.조회, 4.종료
		// 입금 : 잔액에 더하기
		// 			* 0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔액에서 빼기
		//			* 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔액 출력
		// 종료 : break
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1:예금| 2:출금 | 3:잔고 | 4:종료");
		int I = 0;
		int O = 0;
		int M = 0;
		for(int B = 1 ; B <= 4 ; B++) {
			
			B = scan.nextInt ();
			if (B == 1) {
				System.out.println("입금하는 금액");
				I = scan.nextInt ();
				while (true) {
					if (I < 0) {
						System.out.println("금액을 확인하세요");
						break;
					} else {
						M = M + I;
						break;
					}
				}
			} else if (B == 2) {
				System.out.println("출금하는 금액");
				O = scan.nextInt ();
				while (true) {
					if (O > M) {
						System.out.println("잔고가 부족합니다");
						break;
					} else {
						M = M - O;
						break;
					}
				}
			} else if (B == 3) {
				System.out.println("잔고");
				System.out.println(M);
			} else if (B == 4) {
				System.out.println("종료");
				break;
			}
		}

	}

}

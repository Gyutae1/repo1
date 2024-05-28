package chap04;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1씩 증가하는걸 5번 반복할거다
		// 1 + 1 + 1 + 1 + 1
		int sum = 0;
		sum = sum + 1;
//		sum += 1;
//		sum++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);
		
		// 1 + 2 + 3 + 4 + 5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);
		
		
		int i = 0; // 초기화식
		i++; //증감식
		sum = sum + i; //실행문
		
		/* 반복문 만드는 원리
		 * 
		 * 반복 되는것 찾기 ctrl + c ,v 해도 바뀌지 않는 것
		 * 
		 * 반복 되지 않는것 찾기
		 *     패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		 *     변수를 활용해서 반복되게 만들기
		 *     
		 *     
		 * 반복 되지 않는 것의
		 * 		시작조건 찾기
		 * 		종료 조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 */
		
		// 맨 처음 한번만 초기화식 실행
		// 조건이 참이면
		// 실행블럭 실행하고
		// 증감식 실행하고
		// 다시 조건 보기 반복
		// for(초기화식;조건;증감식) {
		//				실행블럭
		// }
		
		int sum2 = 0;
		for( int e = 1 ; e < 6 ; e++ ) {
			sum2 = sum2 + e;
			System.out.println(sum2);
		}
		System.out.println("for 사용 sum2 : "+ sum2);
		
		
		
		/*
		 * 반복되는걸 찾는 쉬운 방법
		 * 일단 복사합니다
		 * 그리고 붙여넣습니다
		 * 마지막으로 변경할 걸 찾아요
		 * 그리고 변경하는 규칙도 찾습니다
		 * 변경되는걸 변수로 바꿉니다
		 */
		
		
		
		
		
		
		
		int sum3 = 0;
		for (int h = 1 ; h <= 10 ; h++ ) {
			sum3 = sum3 + h;
		}
		System.out.println(sum3);
		
		
		// 짝수만 출력하기
		// 1. 증감식 이용하기
		// 2. if문 이용하기 n%2 = 0 일때
		
		// 조금 어려운 문제
		// 1~10까지 한줄에 3개씩 출력되게
		
		for (int h2 = 2; h2 <= 10 ; h2 = h2 + 2) {
			System.out.println("증감식 :"+h2);
		}
		for (int h1 = 1; h1 <= 10 ; h1++) {
//			System.out.println(h1);
			if (h1%2 == 0) {
				System.out.println("if 문 :"+ h1);
			}
		}
		
//		for (int c = 1; c <= 10; c++) {
//			if (c <= 2) {
//				System.out.print(c);
//			} else if ( c <= 3 ) {
//				System.out.println(c);
//			} else if ( c <= 5){
//				System.out.print(c);
//			} else if ( c <= 6){
//				System.out.println(c);
//			} else if ( c <= 8){
//				System.out.print(c);
//			} else if ( c <= 9){
//				System.out.println(c);
//			} else{
//				System.out.println(c);
//				}
//		}
		
		for(int num4 = 1; num4 <= 10; num4++) {
			System.out.print(num4);
			if (num4 % 3 == 0) {
				System.out.println();
			}
		}
		System.out.println("------------------");
		
//		
//		for (int j = 3 ; j <= 27 ; j = j + 3 ) {
//			System.out.println(j);
//		}
//		
		// 1~100까지 3의 배수가 몇개있는가?
		
//		for (int k = 0 ; k <= 100 ; k = k+3) {
//			System.out.println(k);
//		}
		int count = 0;
		for (int kk = 1 ; kk <= 100 ; kk++) {
			if (kk % 3 == 0) {
				count++;
			}
		}
		System.out.println(count);
	
	
	
	
	
	// 구구단
	// 2단 출력
	for (int q = 1;q <= 9; q++) {
		System.out.println(2*q);
		}
	}
}
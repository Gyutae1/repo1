package chap05;

public class 대충 {

	public static void main(String[] args) {
		// 1. 배열 뒤집기 : {1.5.2.4}->{4,2,5,1}
				// 2. 첫번째 자리에 0 넣기 :{0,1.5.2.4}
				// 3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {4,1,5,2}
				
				// [3,4,7,5,1,4,6,4,5]
				// 4. 홀/짝수의 각각 개수를 출력
				// 5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
				
				// 난이도 업
				// 6. 두번째 최대값
				// 7. 내림차순으로 정렬
				
				
				// 로또 6개 번호(1~45)
				// 8. 중복되지 않게 숫자 선정
				// 9. 자리 예약
				// 자리가 10개인 소극장 예약 시스템을 만들자
				// 1~10번까지 번호의 자리가 있음
				// 예약할 자리는? 하고 입력 받음
				// 1)예약이 가능하면 "예약했습니다"
				// 1-2)예약 불가능하면 "이미 예약 되어있습니다."
				// 2)모든 자리의 예약 가능 여부 출력
				// 3)예약 가능한 자리만 출력
				
				// 10. 임시비밀번호 8자리 만들기
				// 1) 모두 다 숫차로
				// 2) 모두 다 소문자로 (hint: char ascii)
				// 3) 숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합
				
				System.out.println();
				System.out.println("test1");
				System.out.println();
				
				int[] array1 = { 1, 5, 2, 4 };
				for(int i = 3; i >=0 && i <= array1.length; i--) {
					
					System.out.print( array1[i] );
							}
				
				System.out.println();
				System.out.println("test2");
				System.out.println();
				
				
				int[] array2 = new int[array1.length + 1];
				array2[0] = 0;
				for(int j= 0; j< array2.length; j++) {
				
					for(int i = 0; i < array1.length; i++) {
					array2[i+1] = array1[i];
					}
					System.out.print(array2[j]);
				}
				
				System.out.println();
				System.out.println("test3");
				System.out.println();
				
				
				

	}

}

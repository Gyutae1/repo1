package chap04;

public class BreakExam {

	public static void main(String[] args) {
		
		System.out.println("게임을 시작하지");
		int count = 0;
		while(true) {
			count++;
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			
			if(num==6) {
				break; // break는 가장 가까운 반복문을 종료
			}
		}
		System.out.println("게임 종료");
		System.out.println(count+"번");
		
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
			
			if( i >= 4) {
				break;
			}
			System.out.println("한 턴 종료");
		} 
		System.out.println("for문 종료");
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i : "+ i);
			
			for (int j=0; j<3; j++ ) {
				
				if (j >= 1) {
					break; // j에 대한 for 문만 종료한다
				}
				System.out.println("j : "+ j);
			}
			System.out.println();
		}
		
		for (int i=0; i<10; i++) {
			if (i % 2 !=0) {
				continue; //이후 실행문은 무시
			}
			System.out.println("짝수? "+ i);
		}
		
		// continue : 다음 쇼츠로 넘어가기
		// break : 유튜브 끄기
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

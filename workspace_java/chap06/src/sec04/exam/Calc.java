package sec04.exam;

public class Calc {
	
	boolean isOn = false;
	void PowerOff() {
		System.out.println("전원을 끕니다");
	}
	void PowerOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	/**
	 * 더하기
	 * 두 수를 받아서 더한 결과를 돌려줌
	 * 
	 * 메소드명 : Plus
	 * 전달인자 : int, int
	 * 리턴타입 : int(두 수를 더한 결과)
	 * 
	 * @author : email@naver.com
	 * @param : int x, int y
	 * @return : int
	 */
	int Plus(int x, int y) {
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		return x + y;
	}
	
	
	double divide(int x, int y) {
		
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		} else {
		return x/(double) y;
		}
	}
	
	/**
	 * 더하기 2
	 * 
	 * 전달인자 : int배열
	 * 리턴타입 : int
	 */
	int Plus2(int[] num) {
		int x = num[0];
		int y = num[1];
		
		return x+y;
	}
	
	/**
	 * 전달인자의 개수를 지정하지 않고
	 * 전달 받은 만큼 처리하는 방법
	 * "..." 가변인자, 가변 길이 파라미터
	 * 전달 받은 모든 전달인자를 배열로 처리
	 */
	int Plus3(int ...num) {
		System.out.println("num :"+num);
		
		int sum = 0;
		for (int i=0; i< num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}
}

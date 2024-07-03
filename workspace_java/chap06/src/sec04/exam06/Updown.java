package sec04.exam06;

public class Updown {
	int y;
	
	
	
	int num(int x) {
		if (x < 7) {
			System.out.println("up 시도횟수:"+(y+1));
			y++;
		} else if (x > 7) {
			System.out.println("down 시도횟수:"+(y+1));
			y++;
		} else if (x == 7) {
			System.out.println("정답입니다 시도횟수:"+(y+1));
		}
		return x;
	}
	
	
}

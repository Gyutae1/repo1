package sec02.exam01;

public class 나 {
	void order(Cafe cafe,String menu) {
		if(cafe.dt()) {
			System.out.println("드라이브쓰루를 이용한다");
			cafe.order(menu);
		} else {
			System.out.println("드라이브쓰루를 이용하지 않는다");
			cafe.order(menu);
		}
	}
}

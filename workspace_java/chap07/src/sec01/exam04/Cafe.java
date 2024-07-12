package sec01.exam04;

public class Cafe {
	String name;
	int price;
	
	void order(String menu) {
		this.name = menu;
	}
	
	int pay(int money) {
		int change = 0;
		
		if(money < this.price) {
			System.out.println(this.name +" 주문은 금액 부족으로 취소합니다");
		} else {
			System.out.println(this.name +" 주문한다");
			change = money - this.price;
		}
		return change;
	}
	
}

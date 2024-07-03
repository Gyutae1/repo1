package sec04.exam07;

public class Bank {
	int balance;
	int deposit(int x) {
		if (x > 0) {
		System.out.println(x+"원을 입금하셨습니다.");
		balance += x;
		} else {
			System.out.println("0 보다 큰 금액을 입금해주세요");
		}
		return x;
	}
	int withdraw(int x) {
		if (balance >= x) {
			System.out.println(x+"원을 출금하셨습니다.");
			balance -= x;
		} else {
			System.out.println("잔액이 부족합니다");
		}
		return x;
	}
	
	void BankOn() {
		System.out.println(balance+"원 있습니다");
	}
}

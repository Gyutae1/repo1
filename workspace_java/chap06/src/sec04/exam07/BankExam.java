package sec04.exam07;

public class BankExam {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(10000);
		bank.deposit(-1);
		bank.BankOn();
		bank.withdraw(9000);
		bank.BankOn();
		bank.withdraw(19000);

	}

}

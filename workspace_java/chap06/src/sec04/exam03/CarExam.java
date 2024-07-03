package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
	
		System.out.println(myCar.name);
		myCar.setName("몽식이");
		System.out.println(myCar.name);
		
		
		myCar.setName("");
		System.out.println(myCar.name);
	}
}

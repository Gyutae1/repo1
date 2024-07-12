package sec02.exam01;

// 대리기사
public class Driver {
//	void runAvante(Avante a) {
//		System.out.println("전달인자로 아반떼만 받음");
//		a.drive();
//	}
//	void runSpark(Spark s) {
//		System.out.println("전달인자로 스파크만 받음");
//		s.drive();
//	}
//	
//	//오버로딩
//	void run(Avante a) {
//		System.out.println("전달인자로 아반떼만 받음");
//		a.drive();
//	}
//	void run(Spark s) {
//		System.out.println("전달인자로 스파크만 받음");
//		s.drive();
//	}
//	
	
	Avante avante = null;
	
	
	void run(Car c) {
		System.out.println("전달인자로 Car만 받음");
		c.drive();
	}
}

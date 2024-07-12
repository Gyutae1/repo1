package sec05.exam02;

public class Calc {
	
	static double pi = 3.141592;
	String color;
	
	Calc(){
		System.out.println(pi);
	}
	// static 에서는
	// static 밖에 못쓴다
	static void test() {
		System.out.println(pi);
	}
	
	// static이 아닌것은
	// static을 마음대로 사용할 수 있다
	void test2() {
		test();
	}
}
